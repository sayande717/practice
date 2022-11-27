import java.util.Scanner;
import java.util.Arrays;

class arrrev
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);    
        int arr[] = new int[6];
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();    
        }
        int start = 0;
        int end = arr.length-1;
        do
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } while(start < end);
        
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}