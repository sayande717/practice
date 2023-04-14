// Ceiling of a number: Smallest element that is >= the target element.
class Ceiling {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,15,16,18};
        int result = findCeiling(array, -99);
        System.out.println(result);
    }
    
    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        // Edge Case: The last number is less than the target element.
        if(arr[end]<target) {
            return -1;
        }
        if(arr[end] == target) {
            return arr[end];
        }
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] < target) {
                start = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else {
                return arr[mid];
            }
        }
        // When while loop ends, the element at index 'start' is the element.
        return arr[start];
    }
}