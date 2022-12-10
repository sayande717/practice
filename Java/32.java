import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("---Fibonacci Series---");
        System.out.print("Enter the range: ");
        int n = in.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i <= n; i++) 
        {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();
        in.close();
    }
}