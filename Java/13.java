import java.util.Scanner;
class sum
{
    static int sumofno(int a, int b)
    {
        return (a+b);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter another number: ");
        int num2 = in.nextInt();
        System.out.println("Sum: "+sumofno(num1,num2));
        in.close();
    }
}