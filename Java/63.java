import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        System.out.println("Enter elements: ");
        for (int i = 0; i < N; i++) {
            System.out.print("Element "+(i+1)+": ");
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Average: "+(sum / N));
        input.close();
    }
}