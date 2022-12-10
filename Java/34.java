import java.util.Scanner;

class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(isArmstrong(number1))
        {
            System.out.println(number1+" is Armstrong!");
        }
        else if(isArmstrong(number2))
        {
            System.out.println(number2+" is Armstrong!");
        }
        else
        {
            System.out.println("None of the numbers are Armstrong.");
        }
        input.close();
    }
    static boolean isArmstrong(int number)
    {
        int length = Integer.toString(number).length();
        int sum = 0;
        //153 = 1^3 + 5^3 + 3^3
        int checknumber = number;
        while(number != 0)
        {
            int mod = number % 10;
            sum += (int)(Math.pow(mod, length));
            number /= 10;
        }
        if(checknumber == sum)
        {
            return true;
        }
        return false;
    }
}