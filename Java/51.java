import java.util.Scanner;

class volumeSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume: "+volume);
        input.close();
    }
}