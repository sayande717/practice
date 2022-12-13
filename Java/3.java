import java.util.Scanner;
class Main
{
    /* Data Types available for input (assuming object name is 'in'):
     * in.nextInt() = Integer
     * in.nextFloat() = Float
     * in.nextDouble() = Double
     * in.nextBoolean() = Boolean
     * in.nextByte() = Byte
     * in.next() = a single word
     * in.nextLine() = Multiple words (ie the next line)
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        /*
         * new = creating a new object of the class Scanner
         * in = the name of the new object.
         */
        System.out.print("Enter a number: ");
        System.out.println(in.nextInt());
        System.out.println("Enter a float value");
        System.out.println(in.nextFloat());
        in.close();
    }
}