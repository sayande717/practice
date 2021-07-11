#include<stdio.h>
void main()
{
    int n1,n2,n3,max;
    printf("Enter 3 numbers:\n");
    scanf("%d %d %d",&n1,&n2,&n3);
    max=n1;
    if(n2>max)
    max=n2;
    if(n3>max)
    max=n3;
    printf("The largest number:%d",max);
}