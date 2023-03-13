/* You can take any element as the pivot element.
 * 
 */

import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start) / 2;
        int pivot = arr[mid];
        while(start <= end) {
            // Don't sort if the left side is already sorted.
            while(arr[start] < pivot) {
                start++;
            }
            // Don't sort if the right side is already sorted.
            while(arr[end] > pivot) {
                end--;
            }

            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
                       
        }

        // Now the pivot is at the correct index.
        quickSort(arr, low, end);
        quickSort(arr, start, high);
        
    }
}