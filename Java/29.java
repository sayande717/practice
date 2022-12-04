import java.util.Scanner;

class BasicCalc
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float number1,number2,result=0;
        char operator;
        boolean badOperator = false;
        System.out.print("Enter Number 1: ");
        number1 = in.nextFloat();
        System.out.print("Enter Number 2: ");
        number2 = in.nextFloat();
        System.out.print("Enter operator (+,-,*,/,%): ");
        operator = in.next().charAt(0);
        if(operator == '+')
        {
            result = number1 + number2;
        }
        else if(operator == '-')
        {
            result = number1 - number2;
        }
        else if (operator == '*') 
        {
            result = number1 * number2;
        }
        else if (operator == '/') 
        {
            result = number1 / number2;
        }
        else if (operator == '%') 
        {
            result = number1 % number2;
        }
        else
        {
            System.out.println("Please enter a proper operator.");
            badOperator = true;
        }
        if(!badOperator)
        {
            System.out.println("Answer: "+result);
        }
        in.close();
    }
}