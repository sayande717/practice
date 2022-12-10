import java.util.Scanner;

class AreaIsocelesTriangle
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of 2 sides: ");
        double side1 = input.nextFloat();
        double side2 = input.nextFloat();
        double area = (side2 * 4) * Math.sqrt((4 * side1 * side1) - (side2 * side2));
        System.out.println("Area: "+area);
        input.close();
    }
}