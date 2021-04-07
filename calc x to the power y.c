//Program to calculate x to the power of y.
#include <stdio.h>
#include <math.h>
int power(int, int);
void main()
{
    int x, y;
    printf("Enter x and y:");
    scanf("%d%d", &x, &y);
    printf("Answer = %d", power(x, y));
    printf("\n");
}
int power(int x, int y)
{
    return pow(x, y);
}