#include <stdio.h>
#include <ctype.h>
void main()
{
    char alphabet;
    printf("Enter an alphabet : ");
    scanf("%c",&alphabet);
    printf("\nReverse case of %c is : ", alphabet);
    if (islower(alphabet))
    printf("%c",tolower(alphabet));
    else printf("%c",tolower(alphabet));
    printf("\n");
}