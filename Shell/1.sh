a=10 #Assigning the value '10' to a
b=20 #There is no dollar sign since we are assigning a value to an user-defined variable.
for((i=$a;i<=$b;i++)) #Here, $a means the value of a.
do
    printf "$i "
done
printf "\n"