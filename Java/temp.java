import java.util.Arrays;
class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,1};
        System.out.println("Array: "+Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr) {
        for(int index = arr.length-1;index>=0;index--) {
            boolean flag=false;
            for(int j = 0;j<index;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=true;
                }
            }
            if (flag == false) {
                return arr;
            }
        }
        return arr;
    }
}