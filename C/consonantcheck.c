#include<stdio.h>
void main()
{
    char n;
    printf("Enter an alphabet:");
    scanf("%c",&n);
    if(n!='A'&&n!='a'&&n!='E'&&n!='e'&&n!='I'&&n!='i'&&n!='O'&&n!='o'&&n!='U'&&n!='u')
    printf("%c is a consonant",n);
    else printf("%c is not a consonant",n);
}