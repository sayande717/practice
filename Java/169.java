class LinkList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,3,8,2,3};
        LinkList list = new LinkList();
        for (int i = 0; i < arr.length; i++) {
            list.addNode(arr[i]);
        }
        System.out.println((list.searchNode(7)));
    }
    public void addNode(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if(head == null) {
            head = newNode;
            return;
        }
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public int searchNode(int nodeToBeSearched) {
        Node currentNode = head;
        int i = 0;
        if(head == null) {
            return -1;
        }
        while(currentNode != null) {
            if(currentNode.data == nodeToBeSearched) {
                return i;
            }
            i++;
            currentNode = currentNode.next;
        }
        return -1;
    }
}