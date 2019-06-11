#!/bin/bash
#set -x
Table_name=$1
source_file=$2
db_name=$3
user_name=$4
password=$5
echo "##### source is $source_file ########before"
source $source_file
echo "##### source is $source_file ########after"

cdc_dt="2019-06-10 09:54:00.000"

dt=$(date +'%Y%m%dT%H%M%S')

	echo "****************Creating Meta*******************"

	echo "creating meta for $Table_name"

	sqoop import  -Dmapred.job.queue.name=myQueue \
		      --connect "$db_name" \
		      --username $user_name \
     		      --password $password \
		      --null-string '' \
		      --null-non-string '' \
		      --fields-terminated-by $Meta_File_delimiter \
		      -m 1 \
                      --query "select * from (select 'mysource' as 'SOURCE_NAME', 'DBO' as 'SCHEMA_NAME',tbl.name as 'TABLE_NAME', c.name as 'COLUMN_NAME',UPPER(t.name) as 'DATA_TYPE',case when  c.precision='0' then c.max_length else   c.precision end as 'DATA_LENGTH',c.scale as ' DATA_SCALE',Case when  t.name='datetime' then 'yyyy-MM-dd HH:mm:ss.SSS' else '' end as 'FORMAT',Case when PRM.ORDINAL_POSITION is null then 'N' Else 'Y' end AS 'PRIMARY_KEYS',COLUMN_ID+2 as COLUMN_ID from sys.columns as c inner join sys.tables as tbl on tbl.object_id = c.object_id and tbl.name= '$Table_name' inner join sys.types as t on c.system_type_id = t.system_type_id and t.name<> 'tAppName' inner join sys.schemas s on  tbl.schema_id = s.schema_id left outer join (select kcu.TABLE_NAME , kcu.COLUMN_NAME, kcu.ORDINAL_POSITION   from INFORMATION_SCHEMA.TABLE_CONSTRAINTS as tc   join INFORMATION_SCHEMA.KEY_COLUMN_USAGE as kcu on kcu.CONSTRAINT_SCHEMA = tc.CONSTRAINT_SCHEMA  and kcu.CONSTRAINT_NAME = tc.CONSTRAINT_NAME and kcu.TABLE_SCHEMA = tc.TABLE_SCHEMA and kcu.TABLE_NAME = tc.TABLE_NAME where tc.CONSTRAINT_TYPE in ( 'PRIMARY KEY' )) PRM on PRM.TABLE_NAME =tbl.name AND PRM.COLUMN_NAME=c.name and \$CONDITIONS union select 'mysource','DBO','$Table_name','CDC_FLAG','VARCHAR',1,0,null,'N',1 union select 'mysource','DBO','$Table_name','CDC_TS','TIMESTAMP',10,6,'yyyy-MM-dd HH:mm:ss.SSS','N',2) A  order by A.COLUMN_ID" \
			--target-dir $Sqoop_Landing_Location/$Meta/$Schema_name/$Table_name 1> "$Meta"_"$Table_name".log 2>> "$Meta"_"$Table_name".log

    cp "$Meta"_"$Table_name".log  $Landing_Location/log

		meta_record_count=`egrep -o "Retrieved [0-9]*" "$Meta"_"$Table_name".log | cut -d' ' -f2`		
		
echo "Source_Name|Schema_Name|TABLE_NAME|COLUMN_NAME|DATA_TYPE|DATA_LENGTH|DATA_SCALE|Format|Primary_Keys|COLUMN_ID" > $Landing_Location/$Meta/$Schema_name/$Table_name/History__"$Table_name""_""$dt".meta
cat $Landing_Location/$Meta/$Schema_name/$Table_name/part-m-* >> $Landing_Location/$Meta/$Schema_name/$Table_name/History__"$Table_name""_""$dt".meta
			
			
	echo "**************************Sqooping Data******************************"

Meta_File_Name=`find $Landing_Location/$Meta/$Schema_name/$Table_name | grep '\.meta' | grep -i $Table_name`
echo $Meta_File_Name
Check_BIT=`cat $Meta_File_Name | grep -e '|BIT|' |wc -l`

column_names=`sed '1,3d' $Meta_File_Name | awk -F'|' '{ if ($5 == "DATETIME") print"Ltrim(Rtrim(convert(char," $4 ",121)))" $4; else print$4; }' | tr '\n' ',' | sed 's/.$//'`


echo $Check_BIT

if [ $Check_BIT == 0 ]
then 
        echo "Sqooping table :"$Table_name

	sqoop import -Dmapred.job.queue.name=fabbdprd_q1 --connect "$db_name" \
                                                --username $user_name \
                                                --password $password \
                                                --null-string '' \
                                                --null-non-string '' \
                                                --fields-terminated-by '\001' \
                                                --lines-terminated-by '\002' \
                                                --hive-drop-import-delims \
                                                --m 1 \
                             --query "SELECT 'I' flag,'2019-06-10 09:54:00.000' TS3, $column_names FROM $Schema_name.$Table_name  where \$CONDITIONS " \
                             --target-dir $Sqoop_Landing_Location/$Data/$Schema_name/$Table_name 1> "$Data"_"$Table_name".log 2>> "$Data"_"$Table_name".log
              echo "sqooped data without BIT dataype"
            cp "$Data"_"$Table_name".log  $Landing_Location/log
else

   echo "Sqooping table :"$Table_name
   Conversion_Fields=`cat $Meta_File_Name | grep -e 'BIT' | awk -F\| '{print $4"=Integer"}' | tr '\n' ',' | sed -e 's/,$//g'`
   echo '$Conversion_Fields'
            sqoop import -Dmapred.job.queue.name=fabbdprd_q1 --connect "$db_name" \
                                                --username $user_name \
                                                --password $password \
                                                --null-string '' \
                                                --null-non-string '' \
                                                --fields-terminated-by '\001' \
                                                --lines-terminated-by '\002' \
                                                --hive-drop-import-delims \
                                                --map-column-java $Conversion_Fields \
                                                --m 1 \
                            --query "SELECT 'I' flag,'2019-06-10 09:54:00.000' TS3,$column_names FROM $Schema_name.$Table_name CUST where \$CONDITIONS " \
                            --target-dir $Sqoop_Landing_Location/$Data/$Schema_name/$Table_name 1> "$Data"_"$Table_name".log 2>> "$Data"_"$Table_name".log
 cp "$Data"_"$Table_name".log  $Landing_Location/log
			    
fi

			 sqooped_table_record_count=`egrep -o "Retrieved [0-9]*" "$Data"_"$Table_name".log | cut -d' ' -f2`
		
			if [[ -z "${sqooped_table_record_count}" && -z "${meta_record_count}" ]]

			then 
				 echo "Sqooping table unsuccessfull $Table_name"
	                         
                                echo $Table_name >> $Landing_Location/$Data/Data_Sqoop_failed_list.txt	
				echo $Table_name >> $Landing_Location/$Meta/Meta_Sqoop_failed_list.txt

			else
				 
				 echo " Retreived $sqooped_table_record_count records in $Table_name dat file "
				 
	                         echo "retreived $meta_record_count records in $Table_name meta file "	

				echo $Table_name >> $Landing_Location/$Meta/Meta_Sqoop_table_list.txt


#########echo "Source_Name|Schema_Name|TABLE_NAME|COLUMN_NAME|DATA_TYPE|DATA_LENGTH|DATA_SCALE|Format|Primary_Keys|COLUMN_ID" > $Landing_Location/$Meta/$Schema_name/$Table_name/History__"$Table_name""_""$dt".meta

######cat $Landing_Location/$Meta/$Schema_name/$Table_name/part-m-* >> $Landing_Location/$Meta/$Schema_name/$Table_name/HIST_mysource_DBo_"$Table_name""_""$dt".meta

     	        		 echo $Table_name >> $Landing_Location/$Data/Data_Sqooped_successfull_list.txt
	 #cat $Landing_Location/$Data/$Schema_name/$Table_name/part-m-* | sed 's//\n/g'  > $Landing_Location/$Data/$Schema_name/$Table_name/History__"$Table_name""_""$dt".dat
       cat $Landing_Location/$Data/$Schema_name/$Table_name/part-m-*  > $Landing_Location/$Data/$Schema_name/$Table_name/History__"$Table_name""_""$dt".dat

		
			sh $Script_Location/create_ctl.sh $source_file $Table_name $dt

			fi
