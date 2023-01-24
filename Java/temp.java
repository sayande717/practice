import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class temp {
    static List<Integer> result;
    public static void main(String[] args) {
        Node left = new Node(2);
        Node right = new Node(3);
        Node root = new Node(1, left, right);
        left.left = new Node(4);
        left.right = new Node(5);
        right.left = new Node(6);
        right.right = new Node(7);
        result = new ArrayList<Integer>();
        System.out.println("Pre-order Traversal: "+preOrderTraversal(root));
        result = new ArrayList<Integer>();
        System.out.println("In-order Traversal: "+inOrderTraversal(root));
    }
    static List<Integer> preOrderTraversal(Node root) {
        Node current = root;
        Stack<Node> stack = new Stack<Node>();
        while(true) {
            while(current!= null) {
                result.add(current.val);
                stack.push(current);
                current = current.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            current = stack.pop();
            current = current.right;
        }
        return result;
    }
    static List<Integer> inOrderTraversal(Node root) {
        Node current = root;
        Stack<Node> stack = new Stack<Node>();
        while(true) {
            while(current!=null) {
                stack.push(current);
                current = current.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}