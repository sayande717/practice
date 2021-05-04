#include<stdio.h>
void main()
{
    int n,min=n,i;
    printf("Enter number of array elements.");
    scanf("%d",&n);
    int a[n];
    printf("Enter array elements.");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]<min)
        min=a[i];
    }
    printf("Smallest number:%d",min);
    printf("\nArray elements:");
    for(i=0;i<n;i++)
    printf("%d\t",a[i]);
}