//Code to sort a set of numbers in ascending order.
#include<stdio.h>
void main()
{
    /*Variable description - 
    n = Stores number of elements in the number array.
    a[n] = the number array.
    n1 = stores a temporary variable to be used for sorting.
    i,j = counter variables used in for loop.
    */
    int n,i,j,n1;
    printf("Enter number of elements:");
    scanf("%d",&n); //Taking number of elements as input
    int a[n];
    printf("Enter elements:");
    for(i=0;i<n;i++)
    scanf("%d",&a[i]); //Take the numbers as input.
    for(i=0;i<n;i++) //perform the sorting.
    for(j=i+1;j<n;j++)
    if(a[i]>a[j])
    {
        n1=a[i];
        a[i]=a[j];
        a[j]=n1;
    }
    printf("Numbers in ascending order:\n");
    for(i=0;i<n;i++)
    printf("%d\t",a[i]); //print the resulting array.
}