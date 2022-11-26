import java.util.Scanner;
class occur
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = in.nextLong();
        System.out.print("Enter the number whose number of occurences you want to find: ");
        byte srch = in.nextByte();
        byte flag=0;
        int c=0;
        while(n!=0)
        {
            long mod = n % 10;
            if(mod == srch)
            {
                c++;
                flag=1;
            }
            n = n / 10;
        }
        if (flag == 0)
        {
            System.out.println("Number not found.");
        }
        else
            System.out.println("Number of occurences of "+srch+": "+c);
        in.close();
    }
}