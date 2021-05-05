//Program to interchange the position of largest and smallest numbers in an array.
#include<stdio.h>
#include<limits.h>
void main()
{
    /*Variables used - 
    a = The array,n = number of elements of array.
    i = Counter variable used used in the for loop.
    min,max = Stores the largest & smallest numbers in the array.
    s = Store a temporary value, needed to swap the values of min & max.
    */
    int n,min=INT_MAX,max=INT_MIN,i,s;
    printf("Enter number of array elements.");
    scanf("%d",&n);
    int a[n];
    printf("Enter array elements.");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]<min)
        min=a[i];
        if(a[i]>max)
        max=a[i];
    }
    /*print original array if necessary.
    printf("\nOriginal array:");
    for(i=0;i<n;i++)
    printf("%d\t",a[i]);
    */
    printf("\nOriginal elements:\nSmallest=%d\tLargest=%d",a[min],a[max]);
    s=a[min];
    a[min]=a[max];
    a[max]=s;
    printf("\nInterchanged elements:\nSmallest=%d\tLargest=%d",a[min],a[max]);
    /*print modified array if necessary.
    printf("\nModified array:");
    for(i=0;i<n;i++)
    printf("%d\t",a[i]);
    */
}