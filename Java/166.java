import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* Notes:
 * I. Passes
 * After 1 pass, the last element is sorted.
 * So, 2nd pass only needs to run till array.length-2.
 * After 2nd pass, the 2nd last & the last element is sorted.
 * So, 3rd pass only needs to run till array.length-3.
 * That is, each pass needs to check for 1 less element (from the last) than the previous one.
 * II. If J never swaps, end the program.
 */

class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter 10 elements: ");
        Arrays.setAll(array, index -> input.nextInt());
        System.out.println("Original Array: "+Arrays.toString(array));
        System.out.println("\nFinal array: "+Arrays.toString(bubbleSort(array)));
        input.close();
    }

    static int[] bubbleSort(int[] arr) {
        // Check if any swap has occured in the current pass.
        boolean checkSwap;
        System.out.println();
        for (int range = (arr.length - 1); range >= 0; range--) {
            checkSwap = false;
            for (int index = 0; index < range; index++) {
            // Change '>' to '<' to sort the array in descending order.
                if (arr[index] > arr[index + 1]) {
                    checkSwap = true;
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
            // If swap has occured, print the partially sorted array.
            if(checkSwap) {
                System.out.println("Pass "+(arr.length - range)+": "+Arrays.toString(arr));
            }
            // If no swap has occured, that means the array is sorted. No need to sort anymore.
            else {
                return arr;
            }
        }
        return arr;
    }
}