import java.util.Stack;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TreeTraversal {
    static List<Integer> result;
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);
        result = new ArrayList<Integer>();
        System.out.println("Pre-Order Traversal: "+preOrderTraversal(root));
        result = new ArrayList<Integer>();
        System.out.println("In-Order Traversal: "+inOrderTraversal(root));
        result = new ArrayList<Integer>();
        System.out.println("Post-order Traversal: "+postOrderTraversal(root));
        result = new ArrayList<Integer>();
        System.out.println("Level order Traversal: "+levelOrderTraversal(root));
    }

    static List<Integer> preOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while (true) {
            while (current != null) {
                // D,L added
                result.add(current.val);
                stack.push(current);
                current = current.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            // R added
            current = stack.pop();
            current = current.right;
        }
        return result;
    }
    
    static List<Integer> inOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(true) {
            // Traverse to the left child (whose value is null) of the left-most node in the tree.
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            // current = top-most element in the stack
            current = stack.pop();
            // The value of current is added to the list 'result'
            result.add(current.val);
            current = current.right;
        }
        return result;
    }

    static List<Integer> postOrderTraversal(TreeNode root) {
        TreeNode current = root;
        TreeNode previous = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
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
                stack.pop();
                previous = current;
                current = null;
            }
            else {
                current = current.right;
            }
        }
        return result;
    }

    static List<Integer> levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            // Calculate the number of nodes in the current level.
            int size = queue.size();
            while(size-- != 0) {
                TreeNode current = queue.remove();
                result.add(current.val);
                // Left and right child of the node is added here.
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
                // size--;
            }
        }
        return result;
    }
}