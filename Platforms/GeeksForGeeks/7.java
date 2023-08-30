// Q. https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {
    Node deleteNode(Node head, int x) {
        int index = 1;
        int target = x - 1;
        Node currentNode = head;

        // EDGE: Only one element
        if (currentNode.next == null) {
            return null;
        }

        // EDGE: Remove 1st element
        if (target == 0) {
            head = currentNode.next;
        }

        while (index < target) {
            currentNode = currentNode.next;
            index++;
        }

        currentNode.next = currentNode.next.next;
        return head;
    }
}