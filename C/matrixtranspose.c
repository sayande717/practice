#include<stdio.h>
void main()
{
    /*Variable description - 
    a[3][3] = Original Matrix.
    b[3][3] = Transposed Matrix.
    i,j = Counter variables used in for loop.
    */
    int a[3][3],b[3][3],i,j;
    printf("Enter elements of the matrix:");
    for(i=0;i<3;i++)
    {
        printf("\n[Row %d]\n",i+1);
        for(j=0;j<3;j++)
        {
            printf("Column %d:",j+1);
            scanf("%d",&a[i][j]);
            b[j][i]=a[i][j];
        }
    }
    printf("Transposed Matrix:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        printf("%d\t",b[i][j]);
        printf("\n");
    }
}