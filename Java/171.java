import java.util.Scanner;
import java.util.Arrays;

class ArraySetAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        // Arrays.setAll(array,generator): This function allows us to input elements in an array
        // 1. From the user.
        Arrays.setAll(array1, index -> input.nextInt());
        // 2. [1,2,3,4,5...]
        Arrays.setAll(array2, index -> index + 1);

        System.out.println("Array (User Input): " + Arrays.toString(array1));
        System.out.println("Array: (Ascending order): " + Arrays.toString(array2));
        input.close();
    }
}