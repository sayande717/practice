import java.lang.reflect.Array;
import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,1,8,6,0};
        for (int counter = 0; counter < arr.length; counter++) {
            boolean checkSwap = false;
            for (int index = 0; index < (arr.length-counter-1); index++) {
                if (arr[index] > arr[index+1]) {
                    checkSwap = true;
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
            }
            if(checkSwap == false) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}