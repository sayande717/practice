//Program to print the position of the smallest number from an array of n numbers.
#include<stdio.h>
#include<limits.h>
void main()
{
    /*Variables used - 
    a = The array,n = number of elements of array.
    i = Counter variable used used in the for loop.
    pos = Stores the position of the smallest number.
    */
    int n,min=INT_MAX,i,pos;
    printf("Enter number of array elements.");
    scanf("%d",&n);
    int a[n];
    printf("Enter array elements.");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]<min)
        pos=(i+1);
    }
    printf("Position of smallest number:%d",pos);
}