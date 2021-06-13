//Program to remove duplicates from array.
//Problem - Output wrong.
#include<stdio.h>
void main()
{
    int n,i,j,c=0;
    printf("Enter the number of elements:");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements:");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        for(j=0;j<i;j++)
        {
            if(a[j]==a[i])
            c++;
        }
        if(c<2)
        {
            a[i]=' ';
        }
        c=0;
    }
    printf("Array without the duplicates:");
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
}