#!/bin/bash/

source_file=$1
Table_name=$2
hard_date=$3

source $source_file


	mkdir -p $Landing_Location/$Ctl/$Schema_name/$Table_name

	echo "************************ creating ctrl file for  $Table_name Table ******************************"
	
		echo "$Table_name"
	
		meta_header=`cat $Landing_Location/$Meta/$Schema_name/$Table_name/*.meta | head -2| tail -1`
	
		Source=`echo $meta_header|cut -d'|' -f1`
		Schema=`echo $meta_header|cut -d'|' -f2`
		EntityName=`echo $meta_header|cut -d'|' -f3`
	       #RecordCount=`cat $Landing_Location/$Data/$Schema_name/$Table_name/*.dat | wc -l`
		RecordCount=`egrep -o "Retrieved [0-9]*" "Data"_"$Table_name".log | cut -d' ' -f2`
                ExtractDate=`date +%Y-%m-%d`
		ExtractTime=`date +%H:%M:%S`
		SourceTimeZone=`date +%Z`
		#Rec_delimiter="\n"
	
		printf "`echo $Source_name`=`echo $Source`\n" > $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Source_schema_name`=`echo $Schema`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Entity_name`=`echo $EntityName`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Record_count`=`echo $RecordCount`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Extract_date`=`echo $ExtractDate`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Extract_time`=`echo $ExtractTime`\n" >>	$Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl 
		printf "`echo $File_time_stamp`=`echo $ExtractTime`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Extract_date_time`=`echo $ExtractDate` `echo $ExtractTime`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $ETL_landing_directory`=`echo $in_bound_location`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $File_load_type`=`echo $FileLoadType`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $ETL_app_userid`=`echo $ETLAppUserId`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Extract_status`=`echo $ExtractStatus`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Source_time_zone`=`echo $SourceTimeZone`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Effective_date`=`echo $ExtractDate`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Data_file_extension`=`echo $DataFileExtension`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Additional_files_extensions`=`echo $metaFileExtension`,`echo $ctlFileExtension`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $File_format_type`=`echo $FileFormatType`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name"_"$hard_date".ctl
		printf "`echo $Source_watermark_1`=,\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl
		printf "`echo $Source_watermark_2`=\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl
		printf "`echo $ETL_process`=`echo $ETLProcess`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl

		printf "`echo $frequency`=`echo $Frequency_type`\n" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl

	       #echo "$Record_delimiter=\\n " >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl
		echo "$Record_delimiter=$Record_Delimiter" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl
    		echo "$Field_delimiter=$Data_File_delimiter" >> $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl


	chmod 777 $Landing_Location/$Ctl/$Schema_name/$Table_name/HISTORY_DBO_"$Table_name""_""$hard_date".ctl

#	sh mv_fiels.sh $Table_name
		exit 0
