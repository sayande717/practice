#include<stdio.h>
int main() {
    int a = 10;
    int* p = &a;
    int** q = &p;
    /*
     * *q = Dereferencing 1 time
     * **q = Dereferencing 2 times
     */
    printf("%d", *q); // Value of P = Address of a
    printf("\n%d", &a); // Address of a
    printf("\n%d", **q); // Value of a
    return 0;
}