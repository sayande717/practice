import java.util.Scanner;

class Largestof2Numbers
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1: ");    
        int number1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int number2 = in.nextInt();
        if(largestOf2Numbers(number1, number2))
        {
            System.out.println(number1+" is larger.");
        }
        else
        {
            System.out.println(number2+" is larger");
        }
        in.close();
    }
    static boolean largestOf2Numbers(int number1, int number2)
    {
        //If Number 1 > Number 2, return true, otherwise return false.
        return (number1 > number2);
    }
}