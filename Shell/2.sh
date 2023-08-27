a=12
b=13
read c
case $c in 
"1") printf "Case 1";;
"2") printf "Case 2";;
*) printf "Default";;
esac
printf "\n"