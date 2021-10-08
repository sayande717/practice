#include <stdio.h>
void main()
{
    int array[100], size, counter, counter2, choice, temp;
    printf("Enter the number of elements [<100] : ");
    scanf("%d", &size);
    printf("Enter array elements : \n");
    for (counter = 0; counter < size; counter++)
    {
        printf("Element %d : ", counter + 1);
        scanf("%d", &array[counter]);
    }
    printf("Enter '1' to sort the array in ascending order, '2' to sort it in descending order : ");
    scanf("%d", &choice);
    for (counter = 0; counter < size - 1; counter++)
    {
        for (counter2 = 0; counter2 < (size - counter - 1); counter2++)
        {
            switch (choice)
            {
            //Sort array in ascending order.
            case 1:
                if (array[counter2] > array[counter2 + 1])
                {
                    temp = array[counter2];
                    array[counter2] = array[counter2 + 1];
                    array[counter2 + 1] = temp;
                }
                break;
            //Sort array in descending order.
            case 2:
                if (array[counter2] < array[counter2 + 1])
                {
                    temp = array[counter2];
                    array[counter2] = array[counter2 + 1];
                    array[counter2 + 1] = temp;
                }
                break;
            default:
                printf("\nInvalid choice.");
                break;
            }
        }
    }
    if (choice == 1 || choice == 2)
    {
        printf("Array elements : \n");
        for (counter = 0; counter < size; counter++)
        {
            printf("\t%d", array[counter]);
        }
        printf("\n");
    }
}