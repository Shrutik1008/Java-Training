package DSA;

public class BSTValidation {
    Node Root;

    BSTValidation() {
        this.Root = null;
    }

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data) root.left = insert(root.left, data);
        else if (data > root.data) root.right = insert(root.right, data);

        return root;
    }

    
    public boolean validate() {
        return checkBST(Root, null, null);
    }

    
    public boolean checkBST(Node node, Integer min, Integer max) {
        if (node == null) return true;

        if ((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }

    
        boolean isLeftBST = checkBST(node.left, min, node.data);
        boolean isRightBST = checkBST(node.right, node.data, max);

        return isLeftBST && isRightBST;
    }

    public static void main(String[] args) {
        BSTValidation bst = new BSTValidation();

        
        bst.Root = bst.insert(bst.Root, 40);
        bst.Root = bst.insert(bst.Root, 20);
        bst.Root = bst.insert(bst.Root, 60);
        bst.Root = bst.insert(bst.Root, 10);
        bst.Root = bst.insert(bst.Root, 30);
        bst.Root = bst.insert(bst.Root, 50);
        bst.Root = bst.insert(bst.Root, 70);
        bst.Root.left.right = bst.new Node(45);

        System.out.println("Tree is valid BST : " + bst.validate());
    }
}
