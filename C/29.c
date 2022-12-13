#include<stdio.h>
void main()
{
    int val; //Stores a value
    int *ptr; //Stores the address of a value
    printf("Enter a value: ");
    scanf("%d",&val);
    ptr = &val; //Stores address of value 'val' in pointer.
    printf("Value: %d",val);
    printf("\nValue: %d",*ptr);
    printf("\nAddress of value: %d",ptr);
    printf("\n");
}