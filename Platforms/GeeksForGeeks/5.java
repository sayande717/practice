// Q. https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

class GfG {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
	    Node currentNode=head;
	    Node nextNode=currentNode.next;
	    while(nextNode!=null){
	        
	        if(nextNode.data==currentNode.data) {
	            currentNode.next=nextNode.next;
	        }
	        else {
	            currentNode=nextNode;
	        }
            nextNode=nextNode.next;
	    }
	    return head;
    }
}