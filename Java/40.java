/*
 * d1 = length of diagonal 1
 * d2 = length of diagonal 2
 * b = length of any side
 * h = height of rhombus
 * a = measure of any interior angle
 */
class AreaOfRhumbus
{
    public static void main(String[] args) 
    {
        int d1 = 20;
        int d2 = 30;
        System.out.println("Area: "+(float)1/2 * d1 * d2);
        int base = 40;
        int height = 25;
        System.out.println("Area: "+base * height);
        int a = 45;
        System.out.println("Area: "+(float)base * base * Math.sin(a));
    }
}