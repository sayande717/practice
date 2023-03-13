/* Working with variables in Recursion.
 * Variables can be in 3 places:
 * ** in the arguments
 * ** as return type
 * ** in the body of the function
 * Whatever is beneficial to the future function calls, goes in the arguments of the function.
 * Everything else goes in the function body.
 */
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        System.out.println(binarySearch(arr, 0, arr.length - 1, 66));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, end, target);
        } else if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        }
        return mid;
    }
}