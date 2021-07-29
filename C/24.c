#include <stdio.h>
/*
Variable description - 
1) a[matrixrow][matrixcolumn] - The integer matrix.
2) matrixrow,matrixcolumn - Number of rows & columns of the integer matrix.
3) positiveno,negativeno,zero - Stores the number of positive numbers, negative numbers and zeros in the matrix.
4) i,j - Counter variables used in for loop.
*/
void main()
{
    int matrixrow, matrixcolumn, i, j, positiveno = 0, negativeno = 0, zero = 0;
    printf("Enter the number of rows & columns of the matrix : ");
    scanf("%d%d", &matrixrow, &matrixcolumn);
    int a[matrixrow][matrixcolumn];
    printf("\nEnter matrix elements:");
    for (i = 0; i < matrixrow; i++)
    {
        printf("\nRow %d \n", i + 1);
        for (j = 0; j < matrixcolumn; j++)
        {
            printf("Column %d : ", j + 1);
            scanf("%d", &a[i][j]);
        }
    }
    for (i = 0; i < matrixrow; i++)
    {
        for (j = 0; j < matrixcolumn; j++)
        {
            if (a[i][j] > 0)
                positiveno++;
            else if (a[i][j] < 0)
                negativeno++;
            else
                zero++;
        }
    }
    printf("\nResult - ");
    printf("\nNumber of Positive numbers : %d", positiveno);
    printf("\nNumber of Negative numbers : %d", negativeno);
    printf("\nNumber of Zeroes : %d\n", zero);
}
