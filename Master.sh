#!/bin/bash

source /Sqoop/Parameters.cfg 

Source_name=`echo "$1"|tr [[:lower:]] [[:upper:]]`
env_name=`echo "$2"|tr [[:lower:]] [[:upper:]]`

	if [ $# != 2 ]
		 then
		    echo "Please enter Source name and env "

#######################################################################################
###############FOR SRC_table################################################################
elif [[ $# == 2 && $Source_name  == "SRC_table" && $env_name == "DEV" ]]

                  then
         ########################## Dev Env ############################      

                user_name=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 3`
                user_ps=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 4`
		host_name=Dbswd0016
		source_file=""
	         
	elif [[ $# == 2 && $Source_name  == "SRC" && $env_name == "TST" ]]
 		  then
			echo "OK"
	############################# Test Env ##########################

	 	user_name=`cat $PassWord | grep -e "$Source_name""|""$env_name" | cut -d'|' -f 3`
		user_ps=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 4`
		host_name="jdbc:sqlserver://localhost;databaseName=test_mynewdb"
                source_file=/home/mahitha/SRC_table_Scripts/Parameters.cfg

		#echo $source_file $host_name $user_name $user_ps
	
	sh $Script_Location/wrapper_script.sh $source_file $host_name $user_name $user_ps
		

	elif [[ $# == 2 && $Source_name  == "SRC" && $env_name == "STG1" ]]
		 then

	######################################### Stg ENV ############################
	
       		user_name=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 3`
		user_ps=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 4`
		host_name=""jdbc:sqlserver://localhost;databaseName=stg_mynewdb""
		source_file=$Script_Location/Parameters.cfg
	
	sh $Script_Location/wrapper_script.sh $source_file $host_name $user_name $user_ps


 	
	elif [[ $# == 2 && $Source_name  == "SRC" && $env_name == "PRD" ]]

		 then
	####################################### PRD ENV ##############################

    
       		user_name=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 3`
		user_ps=`cat $PassWord | grep -e "$Source_name|$env_name" | cut -d'|' -f 4`
		host_name=""jdbc:sqlserver://localhost;databaseName=prd_mynewdb""

		source_file=$Script_Location/Parameters.cfg
	
	sh $Script_Location/wrapper_script.sh $source_file $host_name $user_name $user_ps
			
echo "PRD"
	else 
		echo "entered arguments are invalid "
	fi
