import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    int val; // Node value
    TreeNode left; // Left sub-tree
    TreeNode right; // Right sub-tree
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
    static List<Integer> result = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        String message = new String("""
            Enter your choice:
            1. Pre-order Traversal
            2. In-order Traversal 
            3. Post-order Traversal
            """);
        System.out.print(message);

        switch(input.nextByte()) {
            case 1 -> result = preOrderTraversal(root);
            case 2 -> result = inOrderTraversal(root);
            case 3 -> result = postOrderTraversal(root);
        }

        System.out.println("Tree: "+result);
        input.close();
    }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        if(root != null) {
            result.add(root.val); // D
            preOrderTraversal(root.left); // L
            preOrderTraversal(root.right); // R
        }
        return result;
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        if(root != null) {
            inOrderTraversal(root.left); // L
            result.add(root.val); // D
            inOrderTraversal(root.right); // R
        }
        return result;
    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        if(root != null) {
            postOrderTraversal(root.left); // L
            postOrderTraversal(root.right); // R
            result.add(root.val); // D
        }
        return result; 
    }
}