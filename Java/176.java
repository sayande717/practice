import java.util.Arrays;
class Sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Bubble Sort: "+Arrays.toString(BubbleSort(arr)));
        System.out.println("Selection Sort: "+Arrays.toString(SelectionSort(arr)));
        System.out.println("Insertion Sort: "+Arrays.toString(insertionSort(arr)));
    }

    static int[] BubbleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            boolean checkSwap = false;
            for (int j = 0; j < (i-1); j++) {
                if(arr[j]>arr[j+1]) {
                    checkSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!checkSwap) {
                return arr;
            }
        }
        return arr;
    }

    static int[] SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int limit = arr.length - i - 1;
            int maxIndex = 0;
            for (int j = 0; j <= limit; j++) {
                if(arr[j]>arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[limit];
            arr[limit] = temp;
        }
        return arr;
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}