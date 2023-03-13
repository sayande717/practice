/* Merge Sort
 * 1. Divide the array individual arrays.
 * 2. Store the divided arrays into variables left & right.
 * 3. Sort those arrays & merge them into a final array.
 * 4. Return the final array into left/right.
 * ** mergeSort() is dividing the array recursively into smaller arrays, then calling merge(), which is actually sorting the smaller arrays.
 */

import java.util.Arrays;
class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] firstArr, int[] secondArr) {

        int[] finalArr = new int[firstArr.length+secondArr.length];
        int firstArrIndex = 0, secondArrIndex = 0,finalArrIndex = 0;

        while(firstArrIndex<firstArr.length && secondArrIndex < secondArr.length) {
            if(firstArr[firstArrIndex] <= secondArr[secondArrIndex]) {
                finalArr[finalArrIndex] = firstArr[firstArrIndex];
                firstArrIndex++;
            }

            else if(firstArr[firstArrIndex] > secondArr[secondArrIndex]) { 
                finalArr[finalArrIndex] = secondArr[secondArrIndex];
                secondArrIndex++;
                
            }
            finalArrIndex++;
        }

        // It may be possible that one of the arrays is not complete.
        // That means, when the size of both arrays is different, one of them will be incomplete.
        while(firstArrIndex < firstArr.length) {
            finalArr[finalArrIndex] = firstArr[firstArrIndex];
            firstArrIndex++;
            finalArrIndex++;
        }

        while(secondArrIndex < secondArr.length) {
            finalArr[finalArrIndex] = secondArr[secondArrIndex];
            secondArrIndex++;
            finalArrIndex++;
        }

        return finalArr;
    }

}