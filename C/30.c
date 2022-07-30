#include<stdio.h>
void main()
{
    int val=20,*ptr;
    ptr = &val;
    *ptr+=20;
    printf("Value: %d",val);
    printf("\n");
}