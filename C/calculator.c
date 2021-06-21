/*This program works like a simple calculator. It supports the following functions - 
1. +   > Addition
2. -   > Subtraction
3. *   > Multiplication
4. /   > Division
5. x^y > Finding x to the power of y.*/
#include<stdio.h>
void main()
{
    float operand1, operand2;
    char operator;
    int WantToContinue=1;
    do
    {
        printf("Provide the input in this syntax = <number 1><operation><number 2>. Eg - 2+3\n");
        scanf("%f%c%f", &operand1, &operator, & operand2);
        if (operator== '+')
            printf("Answer - %f", operand1 + operand2);
        else if (operator== '-')
            printf("Answer - %f", operand1 - operand2);
        else if (operator== '*' || operator== 'x' || operator== 'X')
            printf("Answer - %f", operand1 * operand2);
        else if (operator== '/')
        {
            printf("Answer - %f", operand1 / operand2);
        }
        printf("\nPress 1 to continue or any other key to exit.\n");
        scanf("%d",&WantToContinue);
    }while(WantToContinue==1);
}