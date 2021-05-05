//Program to remove duplicate elements from an array.
//Not complete.
#include<stdio.h>
void main()
{
    /*Variable description - 
    a[n] = Array, n = number of elements in array.
    i = Counter variable used in for loop.
    */
   int n,i;
   printf("Enter the number of elements:");
   scanf("%d",&n);
   int a[n];
   printf("Enter elements of the array:");
   for(i=0;i<n;i++)
   scanf("%d",&a[i]);
}