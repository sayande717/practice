import java.util.Scanner;

class AreaOfCircle
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        System.out.println("Area: "+(Math.PI*(radius * radius)));
        input.close();
    }

}