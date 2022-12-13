import java.util.Scanner;

class EvenOrOdd
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        in.close();
        if(evenOrOdd(number))
        {
            System.out.println(number+" is even.");
        }
        else
        {
            System.out.println(number + " is odd.");
        }
    }
    static boolean evenOrOdd(int num)
    {
        return (num % 2 == 0);
    }
}