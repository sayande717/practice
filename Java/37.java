import java.util.Scanner;

class AreaOfRectangle
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length & breadth: ");
        int length = input.nextInt();
        int breadth = input.nextInt();
        System.out.println("Area: "+(length * breadth));
        input.close();
    }
}