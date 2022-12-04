import java.util.Scanner;

class ChangeCurrency
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in rupees: ");
        float currency = in.nextFloat();
        System.out.println("Currency in USD: $"+(currency / 82.0));
        in.close();
    }
}