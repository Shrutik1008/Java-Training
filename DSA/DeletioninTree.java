package DSA;

public class DeletioninTree {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
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

    
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }


    public Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            
            Node successor = findMin(root.right);
            root.data = successor.data;

            
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    public static void main(String[] args) {
        DeletioninTree tree = new DeletioninTree();

        
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("Inorder before deletion: ");
        tree.inorder(tree.root);
        System.out.println();


        tree.root = tree.delete(tree.root, 70);

        System.out.print("Inorder after deleting 70: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
