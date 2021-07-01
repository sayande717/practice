//Program to check for palindrome number.
#include<stdio.h>
void main()
{
    /*Variable descriptions - 
    n = The integer variable to be checked for palindrome.
    ncopy = Stores the value of n1.
    rem = Stores the remainder of n/10.
    revn = Stores the reverse of n1.
    */
    int n,rem,ncopy,revn=0;
    printf("Enter a number:");
    scanf("%d",&n); //Take number as input.
    ncopy=n; //Store the number in another place.
    while(n!=0) //reverse the number, store in revn.
    {
        rem=n%10;
        revn=(revn*10)+rem;
        n/=10;
    }
    if(revn==ncopy) //Check if the reverse of the number matches with the original one.
    printf("%d is a palindrome number.",ncopy);
    else printf("%d is not a palindrome number.",ncopy);
}