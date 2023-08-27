import java.util.Scanner;

class minmax 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        System.out.println("Minimum element: " + minandmax(arr)[0]);
        System.out.println("Maximum element: " + minandmax(arr)[1]);
        in.close();
    }

    static int[] minandmax(int arr[]) 
    {
        int a[] = new int[2];
        /*
            * a[0] = Minimum element.
            * a[1] = Maximum element.
            */
        a[0] = a[1] = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < a[0]) 
            {
                a[0] = arr[i];
            }
            if (arr[i] > a[1]) 
            {
                a[1] = arr[i];
            }
        }
        return a;
    }
}