//Program to concatenate 2 strings.
#include <stdio.h>
void main()
{
   char string1[50], string2[50], i, j;
   printf("Enter the first string: ");
   scanf("%s",string1);
   printf("Enter the second string: ");
   scanf("%s",string2);
   for(i=0;string1[i]!='\0';i++);
   {
       for(j=0;string2[j]!='\0';i++,j++)
       {
           string1[i]=string2[j];
       }
       string1[i]='\0';
   }
   printf("Concatenated string: %s\n",string1);
}
;