class LinkedList {
    Node head;
    // Defining the properties of a node, with the class 'Node'.
    class Node {
        // Data
        String data;
        // Pointer to the next node.
        Node next;
        // Constructor for class Node
        Node(String data) {
            //Assigning data.
            this.data = data;
            // By default, the node points to null.
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.AddAtFirst("abcd");
        list.AddAtFirst("def");
        list.AddAtLast("ghij");
        list.PrintList();
    }

    // Add element at the beginning of the list.
    public void AddAtFirst(String data) {
        // Create a New Node.
        Node newNode = new Node(data);
        //If the linked list doesn't exist...
        if (head == null) {
            // ...Make the New Node as the head node.
            head = newNode;
        }
        else {
            // NewNode will point to the head / first node.
            newNode.next = head;
            // NewNode will become the new head / first node.
            head = newNode;
        }
    }

    // Add element at the end of the list.
    public void AddAtLast(String data) {        
        /* Had we used 'head' to search for the node, we would've lost track of the first node in the linked list.
         * So, we should never try to change the 'head' node.
         */
        Node NewNode = new Node(data);
        if(head == null) {
            head = NewNode;
        }
        else {
            // Set the current node as the head / first node.
            Node currNode = head;
            // Find the node whose next pointer points to 'null'.
            while(currNode.next != null) {
                currNode = currNode.next;
            }
            // CurrentNode will point to the new node, instead of null.
            currNode.next = NewNode;
            // NewNode already points to null, so we don't need to change anything there.
        }
    }
    // Print the linked list.
    public void PrintList() {
        if(head == null) {
            System.out.println("List is empty.");
        }
        Node currNode = head;
        // Keep printing till the current node is not null.
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    // Search for an element in the Linked List.
    public boolean SearchList(String data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}