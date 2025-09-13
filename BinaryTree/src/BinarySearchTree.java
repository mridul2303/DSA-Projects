public class BinarySearchTree {

    // Node class
    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0; // height of new node is 0
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    // ✅ constructor should match class name
    public BinarySearchTree() {
        this.root = null;
    }

    // height function
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // check if tree empty
    public boolean isEmpty() {
        return root == null;
    }

    // insertion (public)
    public void insert(int value) {
        root = insert(value, root);
    }

    // insertion (private recursive)
    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // check if tree is balanced (public)
    public boolean balanced() {
        return balanced(root);
    }

    // recursive balance check
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    // display tree (public)
    public void display() {
        display(this.root, "Root: ");
    }

    // display tree (private recursive)
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    // ✅ main method for quick testing
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        bst.display();
        System.out.println("Is Balanced? " + bst.balanced());
    }
}

