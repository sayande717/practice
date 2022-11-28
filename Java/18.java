import java.util.ArrayList;
import java.util.Scanner;

class Arraylist
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 'n' to stop input.");
        for (int i = 0; ; i++)
        {
            System.out.print("Element "+(i+1)+": ");
            String element = in.next();
            if (element.equalsIgnoreCase("n"))
                break;
            else
            try
            {
                list.add(Integer.parseInt(element));
            } catch (Exception e) 
            {
                System.out.println("Please input an integer.");   
                i--;
            }
                
        }
        System.out.println("List: "+list);
        in.close();
    }
}