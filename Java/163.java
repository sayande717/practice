class BinarySearchIn2DArray
{
    public static void main(String[] args) 
    {
        int[][] array = 
        {
            {9,18,22},
            {-4,36,91},
            {16,33,44}
        };
        int numberToBeSearched = 22;
        for (int row = 0; row < array.length; row++) 
        {
            int result = binarySearch(array[row], numberToBeSearched);
            if(result != -1)
            {
                System.out.println("Number " + numberToBeSearched + " is at Row: "+(row + 1)+" and Position: "+ (binarySearch(array[row], numberToBeSearched) + 1));
                break;

            }
        }
    }
    static int binarySearch(int[] arr, int searchnumber)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = (int)start+(end-start) / 2;
            if(arr[mid] < searchnumber)
            {
                start = mid + 1;
            }
            else if(arr[mid] > searchnumber)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}