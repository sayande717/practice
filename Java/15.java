import java.util.Arrays;
import java.util.Scanner;

class twoarray
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        /*
         * Specifying row number is mandatory, but column number is not.
         * The number of rows is fixed, but the individual size of the inner arrays may vary.
         */
        int arr[][] = new int[3][3];
        for (byte row=0;row<arr.length;row++)
        {
            //arr[row].length = length of the inner array at that index.
            for (byte column=0;column<arr[row].length;column++)
            {
                arr[row][column] = in.nextInt();
            }
        }
        
        for(int row = 0;row<arr.length;row++)
            System.out.println(Arrays.toString(arr[row]));
        System.out.println();
        System.out.println();
        //Printing using enhanced for loop.
        //Data type of array 'arr' is an array (because it's a nested array).
        for (int a[] : arr)
            System.out.println(Arrays.toString(a));
        in.close();
    }
}