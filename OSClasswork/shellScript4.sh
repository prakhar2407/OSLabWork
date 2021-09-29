#!/bin/sh
echo "Enter the Salary" 
read salary
echo "Enter DA"
read da
echo "Enter HRA"
read HRA
grossal=$[salary+da+HRA]
echo "Gross salaey is $[grossal]"
