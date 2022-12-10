import java.util.Scanner;

class AreaOfTriangle
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float parameter1,parameter2,parameter3;
        parameter1 = parameter2 = parameter3 = 0.0f;
        System.out.println();
        System.out.println("1. Right angled Triangle (base, height)");
        System.out.println("2. Equilateral Triangle (length of 1 side)");
        System.out.println("3. Isoceles Triangle (length of 2 sides");
        System.out.println("4. Heron's Formula (length of 3 sides)");
        System.out.print("Enter your choice: ");
        byte choice = input.nextByte();
        switch (choice)
        {
            case 1:
                System.out.print("Enter base and height: ");
                parameter1 = input.nextFloat();
                parameter2 = input.nextFloat();
                System.out.println("Area: "+rightAngledArea(parameter1, parameter2));
                break;
            case 2:
                System.out.println("Enter length of any 1 side: ");
                parameter1 = input.nextFloat();
                System.out.println("Area: "+equilateralArea(parameter1));
                break;
            case 3:
                System.out.println("Enter length of any 2 sides: ");
                parameter1 = input.nextFloat();
                parameter2 = input.nextFloat();
                System.out.println("Area: "+isocelesArea(parameter1, parameter2));
                break;
            case 4:
                System.out.println("Enter length of all 3 sides: ");
                parameter1 = input.nextFloat();
                parameter2 = input.nextFloat();
                parameter3 = input.nextFloat();
                System.out.println("Area: "+heronFormulaArea(parameter1, parameter2, parameter3));
                break;
            default:
                System.out.println("Invalid Choice! Please enter the correct choice.");
                break;
        }
        input.close();
    }
    static double rightAngledArea(float base, float height)
    {
        return ((base * height) / 2.0);
    }
    static double equilateralArea(float side)
    {
        return (Math.sqrt(3) / 4 * (side * side));
    }
    static double isocelesArea(float side1, float side2)
    {
        return (1/4 * side2 * Math.sqrt(4 * side1 * side1 - side2 * side2));
    }
    static double heronFormulaArea(float side1, float side2, float side3)
    {
        float semiperimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter * side3));
    }
}