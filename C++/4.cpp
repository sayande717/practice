#include<stdio.h>
void swap (int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int a = 2;
    int b = 4;
    printf("a=%d,b=%d", a, b);
    swap(&a,&b);
    printf("\nAfter swapping: ");
    printf("\na=%d,b=%d", a, b);
    printf("\n");
    return 0;
}