//Program to subtract 2 numbers.
#include<stdio.h>
void main()
{
    int a,b,ans;
    printf("Enter 2 numbers");
    scanf("%d%d",&a,&b);
    if(a>b)ans=a-b;
    else if(b>a) ans=b-a;
    printf("The answer is:%d",ans);
}