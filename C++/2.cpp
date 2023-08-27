#include <stdio.h>
void method1() {
    int arr[] = {10, 20, 30};
    printf("%d\n", *arr); // arr is an indexing pointer, it returns the value of the first element in the array.
    int *ptr = arr;       // 'arr' has the address of the array 'arr'.
    for (int i = 0; i < 3; i++) {
        printf("%d ", *ptr);
        ptr++; // Getting incremented by 4 (size of int) at each iteration.
    }
}

void method2() {
    int arr[] = {10, 20, 30};
    printf("\n");
    for (int i = 0; i < 3; i++) {
        printf("%d ", *(arr + i)); // *(arr+1) = it goes to the next index, not the next memory location.
    }
}

int main() {
    method1();
    method2();
    printf("\n");
    return 0;
}