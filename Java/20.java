import java.util.Scanner;

class strsearch
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = new String(in.next());
        System.out.print("Enter the character to be searched: ");
        char searchchar = in.next().charAt(0);
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) 
        {
            if(searchchar == s.charAt(i))
            {
                System.out.println("Character found at position: "+(i+1));
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Character not found.");
        }
        in.close();
    }
}