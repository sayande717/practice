class BinarySearch
{
    public static void main(String[] args) 
    {
        int arr[] = {2,4,5,7,13,17};
        int searchnum = 5;
        System.out.println("Position: "+binarySearch(arr,searchnum));
    }
    static int binarySearch(int arr[],int snum)
    {
        int start = 0;
        int end = arr.length - 1;
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
}