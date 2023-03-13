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

    // Custom method for checking for equality
    boolean checkEqual(Node ob) {
        return this.val == ob.val;
    }
}

class Tree {
    public static void main(String[] args) {
        // Tree Nodes
        Node left = new Node(5);
        Node right = new Node(1);
        Node root = new Node(3,left,right);
        left.left = new Node(6);
        left.right = new Node(2, new Node(7),new Node(4));
        right.left = new Node(9);
        right.right = new Node(8);
        Node p = new Node(6);
        Node q = new Node(4);
        Node ancestor = LowestCommonAncestor(root, p, q);
        System.out.println("Ancestor for "+p.val+" & "+q.val+": "+ancestor.val);
    }

    static Node LowestCommonAncestor(Node root, Node p, Node q) {
        // Condition 1 [For root]
        if (root == null) {
            return null;
        }

        // If a node is a descendant of itself.
        if (root.checkEqual(p) || root.checkEqual(q)) {
            return root;
        }
        
        Node left = LowestCommonAncestor(root.left, p, q);
        Node right = LowestCommonAncestor(root.right, p, q);
        // If this is true, it means p & q both lie in the left & right sub-trees of root.
        // So, root is the Lowest Common Ancestor.
        if (left != null && right != null) {
            return root;
        }
        // If left is not null, it means the left sub-tree contains p / q. So, return left.
        // Otherwise return right.
        return (left != null) ? left : right;
    }
}