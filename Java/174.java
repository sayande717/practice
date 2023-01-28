/* Selection Sort time complexity:
 * Worst Case = O(n^2)
 * Best Case = O(n^2)
 */
import java.util.Arrays;
class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        System.out.print("Original Array: "+Arrays.toString(arr));
        selectionSort(arr);
        System.out.println();
        
    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            
            int limit = arr.length - i - 1;
            // Step 1: Find the maximum element.
            int maxIndex = 0;
            for (int index = 0; index <= limit; index++) {
                if(arr[index]>arr[maxIndex]) {
                    maxIndex = index;
                }
            }

            // Swap the elements
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[limit];
            arr[limit] = temp;

            // Print statements to show the progress made so far.
            System.out.println(" | Max Index: "+maxIndex);
            System.out.print("Iteration "+(i+1)+": "+Arrays.toString(arr));
        }
        return arr;
    }
}