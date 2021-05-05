//Program to merge 2 array into a 3rd array.
#include<stdio.h>
void main()
{
    /*Variables used - 
    c1,c2,c3=Number of elements of array 1,2 & merged array 3.
    i=counter variable used in for loop(s).
    a[c1],b[c2],c[c3]=Array 1,2 & 3.
    */
    int c1,c2,c3=0,i;
    printf("Enter number of elements of Array 1&2:");
    scanf("%d%d",&c1,&c2);
    int a[c1],b[c2],c[c1+c2];
    //Input Array 1, merge with Array 3.
    printf("\nInput elements of Array 1:");
    for(i=0;i<c1;i++,c3++)
    {
        scanf("%d",&a[i]);
        c[c3]=a[i];
    }
    //Input Array 2, merge with Array 3.
    printf("\nInput elements of Array 2:");
    for(i=0;i<c2;i++,c3++)
    {
        scanf("%d",&a[i]);
        c[c3]=a[i];
    }
    //Print merged array.
    printf("\nMerged Array:");
    for(i=0;i<c3;i++)
    printf("%d\t",c[i]);
}