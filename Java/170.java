import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        LinkList list = new LinkList();
        System.out.println("Enter 5 numbers within the range (1-50): ");
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            list.AddFirst(input.nextInt());
        }

        System.out.print("Previous list: ");
        list.displayList();
        for(int i = 0;i<5;i++) {
            list.deleteNode();
        }
        list.displayList();
        input.close();
    }
    public void AddFirst(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void displayList() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public void deleteNode() {
        Node previousNode = head;
        Node currentNode = head.next;
        if(previousNode.data > 25) {
            head = previousNode.next;
        }

        while (currentNode != null) {
            if(currentNode.data > 25) {
                previousNode.next = currentNode.next;
            }
            previousNode = previousNode.next;
            currentNode = currentNode.next;
        }
    }
}