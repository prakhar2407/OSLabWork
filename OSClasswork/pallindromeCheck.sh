#!/bin/bash
#!/bin/bash
echo "Enter Number"
read n
num=0
on=$n
while [ $n -gt 0 ]
do
	num=$( expr $num \* 10 )
	k=$( expr $n % 10 )
	num=$( expr $num + $k )
	n=$( expr $n / 10 )
done
if [ $num -eq $on ]
then
	echo "Palindrome"
else
	echo "Not a  Palindrome"
fi
