#!/bin/bash
echo "Enter any number between 1 and 7"
read n
if [ $n -lt 1 -o $n -gt 7 ]
then
	echo "Invalid Number"
	exit
fi

if [ $n -eq 1 ]
then
	echo "Monday"
elif [ $n -eq 2 ]
then
	echo "Tuesday"
elif [ $n -eq 3 ]
then
	echo "Wednesday"
elif [ $n -eq 4 ]
then
	echo "Thursday"
elif [ $n -eq 5 ]
then
	echo "Friday"
elif [ $n -eq 6 ]
then
	echo "Saturday"
elif [ $n -eq 7 ]
then
	echo "Sunday"
fi

