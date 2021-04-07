//Program to print a number in reverse.
#include<conio.h>
#include<stdio.h>
void main()
{
long n,r;
printf("Enter a number:");
scanf("%ld",&n);
printf("The number in reverse:");
while(n!=0)
{
r=n%10;
printf("%d",r);
n=n/10;
}
}