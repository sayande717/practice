import java.util.ArrayList;
import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = input.nextInt();
        while(true) {
            int number = input.nextInt();
            if(number == 0) {
                break;
            }
            if(number > largest) {
                largest = number;
            }
        }
        System.out.println("Largest number: "+largest);
        input.close();
    }
}