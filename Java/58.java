import java.util.Scanner;
class InputTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int number = input.nextInt();
            if(number == 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("Sum: "+sum);
        input.close();
    }
}