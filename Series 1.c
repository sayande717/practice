/*Program to print the result of the series -
1/1! + 2/2! + 3/3! + ... +n/n!.*/
#include<stdio.h>
void main()
{
int n,f=1,i,ans=0;
printf("Enter the value of n:");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
f=f*i;
ans+=i/f;
}
printf("Answer:%d",ans);
}
