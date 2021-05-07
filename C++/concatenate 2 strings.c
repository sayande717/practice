//Program to concatenate 2 strings.
#include<stdio.h>
#include<limits.h>
void main()
{
    /*Variable descriptions - 
    string1,string2 = Strings 1 & 2.
    i = counter variable used in for loop.
    */
    char string1[INT_MAX], string2[INT_MAX];
    int i;
    printf("Enter 1st string.");
    scanf("%s",&string1);
    printf("Enter 2nd string.");
    scanf("%s",&string2);
    //not complete