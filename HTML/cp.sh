scphtml()
{
    scp -r $filename'.html' rpi:'~/code/html/'
}
scpfile()
{
    scp -r $filename rpi:'~/code/html/'
}
printf '1: scp file.html
2: scp file in other directory
Input: '
read num
if [ $num -eq 1 ]
then
    printf 'Enter file name: '
    read filename
    scphtml
elif [ $num -eq 2 ]
then
    printf 'Enter directory: '
    read path
    printf "1: html file\n2: other file\nInput: "
    read num
    if [ $num -eq 1 ]
    then
        printf 'Enter file name: '
        read filename
        scphtml
    elif [ $num -eq 2 ]
    then
        printf 'Enter file name with extension: '
        read filename
        scpfile
    fi
else
    printf "Wrong input\n"
fi