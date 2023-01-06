
/* Notes:
 * I. Passes
 * After 1 pass, the last element is sorted.
 * So, 2nd pass only needs to run till array.length-2.
 * After 2nd pass, the 2nd last & the last element is sorted.
 * So, 3rd pass only needs to run till array.length-3.
 * That is, each pass needs to check for 1 less element (from the last) than the previous one.
 * II. If J never swaps, end the program.
 * If, in a particular pass, j never swaps any element, that means that the array is already sorted.
 * In that case, we can end the program.
 */
import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(array));
        // No need to sort in these conditions.
        if(array.length <= 1) {
            System.out.println("Final array: "+Arrays.toString(array));
        }

        else {
            System.out.println("\nFinal array: "+Arrays.toString(bubbleSort(array)));
        }
        
    }

    static int[] bubbleSort(int[] arr) {
        // Check if any swap has occured in the current pass.
        boolean checkSwap;
        int len = arr.length;
        System.out.println();
        for (int i = (len - 1); i >= 0; i--) {
            checkSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    checkSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // If swap has occured, print the partially sorted array.
            if(checkSwap) {
                System.out.println("Pass "+(len-i)+": "+Arrays.toString(arr));
            }
            // If no swap has occured, that means the array is sorted. No need to sort anymore.
            else {
                return arr;
            }
        }
        return arr;
    }
}