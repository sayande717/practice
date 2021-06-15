#include<stdio.h>
int add(int,int);
int sub(int,int);
int mul(int,int);
int div(int,int);
int rem(int,int);
void main()
{
    int a,b;
    char op;
    printf("Only +,-,*,/ supported\n");
    printf("Provide your input in this syntax - <number 1><operation><number 2>. Eg-2+3\n");
    scanf("%d%c%d",&a,&op,&b);
    printf("Answer - ");
    if(op=='+')
    printf("%d",add(a,b));
    if(op=='-')
    printf("%d",sub(a,b));
    if(op=='*'||op=='x')
    printf("%d",mul(a,b));
    if(op=='/')
    {
        printf("%d",div(a,b));
        printf("\nRemainder - %d",rem(a,b));
    }
    printf("\n");
}
int add(int n,int m)
{
    return n+m;
}
int sub(int n,int m)
{
    return n-m;
}
int mul(int n,int m)
{
    return n*m;
}
int div(int n,int m)
{
    return n/m;
}
int rem(int n,int m)
{
    if(n%m!=0)return n%m;
    else return 0;
}