import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.List;
import java.util.Queue;
class Node {
    int val;
    Node node;
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
class NodeTraversal{
    static List<Integer> result;
    public static void main(String[] args) {
        
    }

    static List<Integer> postOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        Node previous = null;
        while(true) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            current = stack.peek();
            if(current.right == null || current.right == previous) {
                result.add(current.val);
                previous = current;
                current = null;
            }
            else {
                current = current.right;
            }
        }
        return result;
    }

    static List<Integer> levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size!=0) {
                Node current = queue.remove();
                result.add(current.val);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
                size--;
            }
        }
        return result;
        
    }
}