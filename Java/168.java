import java.util.LinkedList;
class List {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // By default, elements are added at the end of the linked list.
        list.add(2);
        list.add(3);
        list.addLast(4);
        list.addFirst(1);
        // Print: Method 1
        System.out.println(list);
        // Print: Method 2
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        // Searching for an element
        int searchValue = 3;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == searchValue) {
                System.out.println("Element found at position: "+(i+1));
            }
        }
        
        //Removing elements
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
        
        // Remove element at a specific index
        list.remove(1);
        System.out.println(list);
    }
}