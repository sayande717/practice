#include<stdio.h>
void main()
{
    /*Variable descriptions - 
    n = the total number of thieves and policemen.
    k = an integer.
    a[n] = The array containing the thieves and policemen.
    c = An integer which counts the number of policemen.
    i = counter variable used in for loop.
    */
    int n,k;
    //Enter the value of n & k.
    scanf("%d %d",&n,&k);
    if(n<1000&&k<100)
    {
        int a[n],c=0,i;
        for(i=0;i<(n-1);i++)
        {
            //Enter the array elements.
            scanf("%d ",&a[i]);
            if(a[i]==1)
            c++;
        }
        printf("%d",c);
    }
    else printf("Constraints not met.");
}