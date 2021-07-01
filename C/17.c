//Program to print the position of the smallest number from an array of n numbers.
#include<stdio.h>
#include<limits.h>
void main()
{
    /*Variables used - 
    a = The array,n = number of elements of array.
    i = Counter variable used used in the for loop.
    min = Stores the smallest number.
    pos = Stores the position of the smallest number.
    */
    int n,min=INT_MAX,i,pos=0;
    printf("Enter number of array elements."); 
    scanf("%d",&n); //Takes no. of array elements as input.
    int a[n];
    printf("Enter array elements.");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);  //Takes array elements as input.
        if(a[i]<min) //Checks if the element is smaller than 'min' & stores it's position if true.
        {
            min=a[i];
            pos=(i+1);
        }
    }
    printf("Position of smallest number:%d",pos); //Prints the position of the smallest number.
}