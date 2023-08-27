import java.util.Scanner;

class temp
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("Element "+(i+1)+": ");
            arr[i] = in.nextInt();
        }

        System.out.print("Enter element to be searched: ");
        int searchnum = in.nextInt();
        in.close();
        int ans = linearSearch(arr, searchnum);
        if (ans == -1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at position: "+(ans+1));
        }
    }

    static int linearSearch(int arr[], int srchnum)
    {
        for (int i = 0;i < arr.length;i++)
        {
            if(arr[i] == srchnum)
                return i;
        }
        return -1;
    }
}