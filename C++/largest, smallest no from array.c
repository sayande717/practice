#include<stdio.h>
void main()
{
    int n,min=n,max=0,i,s;
    printf("Enter number of array elements.");
    scanf("%d",&n);
    int a[n];
    printf("Enter array elements.");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]<min)
        min=i;
        else if(a[i]>max)
        max=i;
    }
    printf("Original array:");
    for(i=0;i<n;i++)
    printf("%d\t",a[i]);
    s=a[min];
    a[min]=a[max];
    a[max]=s;
    printf("Array with interchanged elements:");
    for(i=0;i<n;i++)
    printf("%d\t",a[i]);
}