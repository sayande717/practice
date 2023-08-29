// Q. https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
import java.util.Stack;

class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}

class Solution
{
    Node compute(Node head)
    {
        if(head==null||head.next==null) return head;
        Node temp=head;
        Stack<Node> stack=new Stack<>();
        stack.push(head);
        temp=temp.next;
        while(temp!=null){
            
            while(!stack.isEmpty()&&temp.data>stack.peek().data)
                  stack.pop();
            stack.push(temp);
            temp=temp.next;
        }
        head=null;
        while(!stack.isEmpty()){
            temp=stack.pop();
            temp.next=head;
            head=temp;
        }
        return head;
    }
}