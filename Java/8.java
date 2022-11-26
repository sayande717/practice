import java.util.Scanner;

class calc 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float num1, num2, result = 0;
        char op;
        do
        {
            System.out.println("Enter 2 numbers: ");
            num1 = in.nextInt();
            num2 = in.nextInt();
            System.out.println("Enter operator: ");
            op = in.next().charAt(0);
            switch (op) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            System.out.println("Result: " + result);
        } while (op != 'X' || op != 'x');
        in.close();
    }
}