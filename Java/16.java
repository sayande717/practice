/*
 * ArrayLists = Used when we do not know how many elements we want / the user will input, in an array.
 * Initialisation = 
 * import java.util.ArrayList;
 * ArrayList<Wrapper Class> = new ArrayList<>();
 * Wrapper Class = Wrapper Class of the data types, ex. Integer, String, etc.
 */
import java.util.ArrayList;
import java.util.Scanner;
class arraylist
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //Add an element to the ArrayList.
        list.add(50);
        list.add(60);
        //Replace the element at index: '0' with element '56'.
        list.set(0, 76);
        for (int i = 0; i < 5; i++) 
        {
            list.add(in.nextInt());    
        }
        System.out.println(list);
        //2D ArrayList
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) 
        {
            list2.add(new ArrayList<>());    
        }
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                //Get the list at index i and add the element to it.
                list2.get(i).add(in.nextInt());
            }    
        }
        System.out.println(list2);  
        in.close();
    }
}