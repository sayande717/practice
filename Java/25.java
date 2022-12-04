import java.util.Scanner;

class BinarySearch
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements (<=100): ");
        int[] arr = new int[100];
        int arrlen = in.nextInt();
        int position = 0;
        System.out.println("Enter elements, in a sorted manner: ");
        for (int index = 0; index < arrlen; index++) 
        {
            System.out.print("Element "+(index+1)+": ");
            arr[index] = in.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int searchnum = in.nextInt();
        in.close();
        if(arr[0] < arr[arrlen - 1])
        {
            position = binarySearchAscending(arr, arrlen, searchnum);
            if(checkPosition(position))
            {
                System.out.print("Array is in ascending order. ");
                System.out.println("Position: " + (position + 1));
            }
            else
                printNotFound();
        }
        else if(arr[0] > arr[arrlen - 1])
        {
            position = binarySearchDescending(arr, arrlen, searchnum);
            if(checkPosition(position))
            {
                System.out.print("Array is in descending order. ");
                System.out.println("Position: " + (position + 1));
            }
            else
                printNotFound();
        }
        else
        {
            if(arr[0] == searchnum)
            {
                System.out.print("Array contains only 1 element. ");
                System.out.println("Position: 1");
            }
            else
                printNotFound();
        }
        
    }
    static boolean checkPosition(int pos)
    {
        return (pos != -1);
    }
    static void printNotFound()
    {
        System.out.println("Element not found.");
    }
    static int binarySearchAscending(int arr[],int arrlength, int snum)
    {
        int start = 0;
        int end = arrlength - 1;
        while(start <= end)
        {
            //int mid = (int) (start + end) / 2; This can exceed the range of integer.
            int mid = (int) start + ((end - start) / 2); //This will never exceed the range on integer.
            
            if(snum < arr[mid])
            {
                end = mid - 1;
            }
            else if(snum > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int binarySearchDescending(int[] arr, int arrlength, int snum)
    {
        int start = 0;
        int end = arrlength - 1;
        while(start <= end)
        {
            int mid = (int)(start + (end - start) / 2);
            if(snum < arr[mid])
            {
                end = mid + 1;
            }
            else if(snum > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}