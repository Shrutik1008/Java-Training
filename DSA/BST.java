package DSA;

public class BST {
    Node root;

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }


public Node findMin(Node node) {
    while (node.left != null) {
        node = node.left;
    }
    return node;
}

    public static void main(String[] args) {
        BST bst = new BST();

        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 70);

        System.out.print("Inorder Traversal: ");
        bst.inorder(bst.root);

        System.out.println();

        int dataToSearch = 50;
        if (bst.search(bst.root, dataToSearch)) {
            System.out.println("Element " + dataToSearch + " found in BST.");
        } else {
            System.out.println("Element " + dataToSearch + " not found in BST.");
        }
    }
}
