import java.util.Scanner;
class rev
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int rev = 0;
        while (n!=0)
        {
            int mod = n % 10;
            rev = (rev * 10) + mod;
            n = n / 10;
        }
        System.out.println("Reverse: "+rev);
        in.close();
    }
}