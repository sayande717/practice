#include<stdio.h>
void main()
{
    int n,i,c=0;
    printf("Enter a number:");
    scanf("%d",&n);
    for (i=0; i<n; i++)
    if(n%i==0)
    c++;
    if(c==1)
    printf("%d is a prime number.\n",n);
    else printf("%d is not a prime number.\n",n);
}