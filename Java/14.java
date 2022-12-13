import java.util.Arrays;
import java.util.Scanner;

class forloop
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        //for (int i : arr) = for (datatype reference-variable in array)
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();    
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr[1]);
        in.close();
    }
}