import java.util.Scanner;

class volumeCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        System.out.println("Volume: "+(Math.PI * radius * radius * height) / 3);
        input.close();
    }
}