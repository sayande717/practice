class digits
{
    public static void main(String[] args) 
    {
        /*
         * Finding the number of digits of a number with:
         * Base 2 (Binary): (int)(Math.log base 2) + 1
         * Base 8 (Octal): (int)(Math.log base 8) + 1
         * Base 10: (int)(Math.log base 10) + 1
         */
        int num = 2345;
        System.out.println("Number of digits: "+(int)(Math.log10(num)+1));    
    }
}