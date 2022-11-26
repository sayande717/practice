import java.util.Scanner;
class Typecasting
{
    /* Conditions for Type Casting:
     * Data Types must be compatible
     * The data type that the value needs to be casted to has to be smaller than the type it was originally.
     * Integer -> Float = possible. Float -> Integer = Not possible
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        System.out.println(num);
        //Explicit type casting
        int num1 = (int)67.47f;
        System.out.println(num1);
        in.close();

        int a = 257;
        byte b = (byte)a; // It stores 257 % 256 ie 257 % (max limit of byte) = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        int e =(c * d); //Here, Java is automatically promoting the data type to 'int' in order to evaluate the expression.
        System.out.println(e);
        /* Type promotion rules
         * All byte, short character values are promoted to integer.
         * If any operation is long,float,the whole operation will be promoted to long,float.
         */
    }
}