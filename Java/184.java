// Floor of a number: Largest element that is <= the target element.
class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(findFloor(arr,16));
    }
    static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        // Edge case: Floor can't be present in the array.
        if(arr[start] > target) {
            return -1;
        }
        else if(arr[start] == target){
            return arr[start];
        }
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] < target) {
                start = mid+1;
            }
            else if(arr[mid] > target) {
                end = mid-1;
            }
            else {
                return arr[mid];
            }
        }

        return arr[end];
    }
}