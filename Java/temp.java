class TestList {
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // Head / First Node.
    Node head;
    public static void main(String[] args) {
        TestList list = new TestList();
        list.AddFirst("abcd");
        list.AddFirst("zzz");
        list.AddLast("def");
        list.PrintList();
        System.out.println(list.SearchList("zzz"));
    }
    public void AddFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void AddLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void PrintList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    
}