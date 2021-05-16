//Program to interchange the position of largest and smallest numbers in an array.
#include<stdio.h>
#include<limits.h>
void main()
{
    /*Variables used - 
    a = The array,n = number of elements of array.
    i = Counter variable used used in the for loop.
    min,max = Stores the position of largest & smallest numbers in the array.
    s = Store a temporary value, needed to swap the values of min & max.
    */
    int n,max=0,i,s;
    printf("Enter number of array elements.");
    scanf("%d",&n);
    int a[n],min=(n-1);
    printf("Enter array elements.");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]<a[min])
        min=i;
        if(a[i]>a[max])
        max=i;
    }
    printf("\nOriginal elements:\nSmallest=%d\tLargest=%d",a[min],a[max]);
    s=a[min];
    a[min]=a[max];
    a[max]=s;
    printf("\nInterchanged elements:\nSmallest=%d\tLargest=%d\n",a[min],a[max]);
}