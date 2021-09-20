#include <stdio.h>
void Display(int A[], int n) //n elements of array A will be displayed.
{
    /*Variable description - 
    A[] (int) - Integer array taken as input.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in for loop.
    */
    int counter;
    printf("\nArray : \n");
    for (counter = 0; counter < n; counter++)
        printf("%d ", A[counter]);
}
int CountOdd(int A[], int n) //Returns no. of odd numbers in array A.
{
    /*Variable description - 
    A[] (int) - Integer array taken as input.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in for loop.
    freqofoddno (int) - Counts the frequency of odd numbers in the array A.
    */
    int counter, freqofoddno = 0;
    for (counter = 0; counter < n; counter++)
        if (A[counter] % 2 != 0)
            freqofoddno++;
    return freqofoddno;
}
int FindSmallest(int A[], int n) //Finds smallest no. in array A.
{
    /*Variable description - 
    A[] (int) - Integer array.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in for loop.
    smallest (int) - Stores the smallest number in the array A.
    */
    int smallest = A[0], counter;
    for (counter = 0; counter < n; counter++)
        if (A[counter] < smallest)
            smallest = A[counter];
    return smallest;
}
void Reverse(int A[], int n)
{
    /*Variable description - 
    A[] (int) - Integer array.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in for loop.
    */
    int counter;
    printf("\nArray elements in reverse : \n");
    for (counter = (n - 1); counter >= 0; counter--)
        printf("%d ", A[counter]);
}
void PrintFrequency(int A[], int n)
{
    /*Variable description - 
    A[] (int) - Integer array.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in outer for loop.
    counter2 (int) - Counter variable used in inner for loop.
    counted (int) - Used to check if an element has already been counted or not.
    freqarray[n] - Array to store frequency of elements.
    searchelement (int) - Stores the element to be searched.
    frequency (int) - Stores the frequency of occurence of the element to be searched.
    */
    int counter, counter2, searchelement, frequency = 0;
    printf("\nElement\tFrequency");
    for (counter = 0; counter < n; counter++)
    {
        searchelement = A[counter];
        for (counter2 = 0; counter2 < n; counter2++)
        {
            if (A[counter2] == searchelement)
                frequency++;
        }
        printf("\n%d\t%d", A[counter], frequency);
        frequency = 0;
    }
}
void Replace(int A[], int n, int x, int y)
{
    /*Variable description - 
    A[] (int) - Integer array.
    n (int) - Stores the number of elements in the array.
    x (int) - Stores the element to be replaced.
    y (int) - Stores the element that 'x' will be replaced with.
    counter (int) - Counter variable used in outer for loop.
    */
    int counter;
    printf("Array : \n");
    for (counter = 0; counter < n; counter++)
    {
        if (A[counter] == x)
            A[counter] = y;
        printf("%d ", A[counter]);
    }
}
int isPrime(int n) //Returns 1 if 'n' is a prime number, otherwise 0.
{
    /*Variable description - 
    counter (int) - Counter variable used in outer for loop.
    frequency (int) - Stores the number of times 'n' is divisible by 'counter'.
    */
    int counter, frequency = 0;
    for (counter = 1; counter <= n; counter++)
    {
        if (n % counter == 0)
            frequency++;
    }
    if (frequency == 2)
        return 1;
    else
        return 0;
}
int SearchPrime(int A[], int n) //Return the 1st instance of prime number.
{
    /*Variable description - 
    A[] (int) - Integer array.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in outer for loop.
    */
    int counter;
    for (counter = 0; counter < n; counter++)
    {
        if (isPrime(A[counter]) == 1)
        {
            return counter;
            break;
        }
    }
    return 0;
}
void main() //Main function.
{
    /*Variable description - 
    choice (int) - Stores the user's choice.
    array[100] (int) - Integer array taken as input from the user.
    n (int) - Stores the number of elements in the array.
    counter (int) - Counter variable used in for loop.
    x (int) - Stores the element to be replaced (for case 6).
    y (int) - Stores the element that 'x' will be replaced with (for case 6).
    Continue (char) - Stores 'y' or 'n' depending on whether the user wants to call another function or not.
    */
    int choice, array[100], n, counter, x, y;
    char willContinue = 'y';
    printf("Enter the number of elements in the array : ");
    scanf("%d", &n);
    printf("\nEnter array elements : \n");
    for (counter = 0; counter < n; counter++)
    {
        printf("Element %d : ", counter + 1);
        scanf("%d", &array[counter]);
    }
    while (willContinue == 'y' || willContinue == 'Y')
    {
        printf("\nYour options : ");
        printf("\n1. Display 'n' elements of the array.");
        printf("\n2. Count the number of odd numbers present in the array.");
        printf("\n3. Find the smallest number present in the array.");
        printf("\n4. Reverse the array elements.");
        printf("\n5. Print the frequency of each element of the array.");
        printf("\n6. Replace element 'x' by element 'y' in the array.");
        printf("\n7. Print the position of the first occurence of any prime number in the array.\n");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("\nValue of 'n' entered by you was %d. The elements are : ",n);
            Display(array, n);
            break;
        case 2:
            printf("\nNo. of odd numbers present in array : %d", CountOdd(array, n));
            break;
        case 3:
            printf("\nThe smallest number present in the array is '%d'.", FindSmallest(array, n));
            break;
        case 4:
            Reverse(array, n);
            break;
        case 5:
            PrintFrequency(array, n);
            break;
        case 6:
            printf("\nEnter the value of 'x' and 'y'.\n");
            printf("x : ");
            scanf("%d", &x);
            printf("y : ");
            scanf("%d", &y);
            Replace(array, n, x, y);
            break;
        case 7:
            if (SearchPrime(array, n) == 0)
                printf("No prime numbers are present in the array.");
            else
                printf("1st occurence of prime number is at position : %d", SearchPrime(array, n) + 1);
            break;
        default:
            printf("Wrong input! Please try again.");
            break;
        }
        printf("\n\nEnter 'y' to continue, 'n' to exit : ");
        scanf(" %c", &willContinue);
    }
}