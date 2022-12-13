import java.util.Scanner;

class GreetUser
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = new String(in.next());
        System.out.println("Greetings, "+name+"!");
        in.close();
    }
}