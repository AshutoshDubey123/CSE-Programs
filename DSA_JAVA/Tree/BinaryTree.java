// Node class represents each node of the binary tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// BinaryTree class contains methods for Binary Tree operations
class BinaryTree {
    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Insert a new node into the binary tree
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive function to insert a new node
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    // In-order traversal (Left, Root, Right)
    void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Search for a node with given data
    boolean search(int data) {
        return searchRec(root, data) != null;
    }

    Node searchRec(Node root, int data) {
        // Base case: root is null or data is present at root
        if (root == null || root.data == data)
            return root;

        // Value is greater than root's data
        if (data > root.data)
            return searchRec(root.right, data);

        // Value is smaller than root's data
        return searchRec(root.left, data);
    }

    // Main method to test the binary tree implementation
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Traversals
        System.out.println("In-order traversal:");
        tree.inOrder();

        System.out.println("Pre-order traversal:");
        tree.preOrder();

        System.out.println("Post-order traversal:");
        tree.postOrder();

        // Search for a value
        System.out.println("Is 40 in the tree? " + tree.search(40));
        System.out.println("Is 25 in the tree? " + tree.search(25));
    }
}
