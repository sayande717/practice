/* Insertion Sort
 * Time Complexity (n = length of array):
 * Worst Case: O(n^2)
 * Best Case: O(n)
 * Q. Why do we use Insertion Sort?
 * Number of swaps are reduced as compared to Bubble Sort.
 * It is stable.
 * Works best for smaller values of n, when the array is already sorted.
 * How it works [Example array: {5,4,1,2,3}]
 * Step 1: Sort {5,4}, result = {4,5}
 * Step 2: Sort {4,5,1}, result = {1,4,5}
 * Step 3: Sort {1,4,5,2}, result = {1,2,4,5}
 * Step 4: Sort {1,2,4,5,3}, result = {1,2,3,4,5}
 * Total steps needed: array.length-1
 * Outer loop runs from 0 to array.length-2
 * Inner loop runs from (i+1) to 1
 */

import java.util.Arrays;
class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Sorted Array: "+Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}