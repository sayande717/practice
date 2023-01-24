#include<stdio.h>
int main() {
    int a = 10;
    //Pointer variable
    int* ptr = &a;
    // *ptr = Dereferencing 1 time
    printf("%d",*ptr); // Value of a
    printf("\n%d",ptr); // Address of a
    printf("\n%d",&ptr); // Address of ptr
    return 0;
}