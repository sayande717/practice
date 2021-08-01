/*Program to find out the trace of a square matrix.
The trace of a square matrix is defined as the sum of the principle diagonal elements of a matrix.*/
#include<stdio.h>
void main()
{
    /*Variable description - 
    rc = Stores the number of rows & columns of the matrix, no. of row = no. of columns for a square matrix.
    a[rc][rc] = The matrix.
    i,j = counter variables used in for loop.
    s = Stores the sum of principle diagonal elements.
    */
    int rc,i,j,s=0;
    printf("Enter the number of rows(=columns)");
    scanf("%d",&rc); //Take the number of rows or columns as input.
    int a[rc][rc];
    printf("Enter the elements of the matrix.\n");
    for(i=0;i<rc;i++)
    {
        printf("\nRow %d:\n",(i+1));
        for(j=0;j<rc;j++)
        {
            printf("Column %d : ",(j+1));
            scanf("%d",&a[i][j]); //Take the elements of the array as input.
            if(i==j) //Check if row number = column number.
            s=s+a[i][j]; //Adds the elements which satisfy the condition ie row = column.
        }
    }
    printf("\nThe trace of the square matrix is %d.",s); //Print the trace of the matrix.
}