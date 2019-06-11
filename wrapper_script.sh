#!/bin/bash/
#set -vx
Source_file=$1
db_name=$2
user_name=$3
password=$4

source $Source_file

Start_dt=$(date)

mkdir -p $Landing_Location/log

echo "********start time: $Start_dt *********"
	
				 export  src=$Source_file
				 export  db=$db_name
			         export  usr=$user_name
			         export  pss=$password


		awk '{print $0 " " ENVIRON["src"] " " ENVIRON["db"] " " ENVIRON["usr"] " " ENVIRON["pss"]}' $Landing_Location/$Table_list/Table_list.txt > $Landing_Location/$Table_list/$Table_list.txt

		chmod 600 $Landing_Location/$Table_list/$Table_list.txt

	      # For 10 tables only. (Between tables 70 to 80 in the list)	
		#cat $Landing_Location/$Table_list/$Table_list.txt | head -80 | tail -10 | xargs -n 1 -L 1 -P 10 sh $Script_Location/meta_script_varified.sh
		
	      # For all available tables from Source
		cat $Landing_Location/$Table_list/$Table_list.txt |xargs -n 1 -L 1 -P 10 sh $Script_Location/meta_script_varified.sh

	#fi
		End_dt=$(date)
echo "*********end time: $End_dt *************"
