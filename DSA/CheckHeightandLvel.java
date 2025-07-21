package DSA;

public class CheckHeightandLvel {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data) root.left = insert(root.left, data);
        else if (data > root.data) root.right = insert(root.right, data);

        return root;
    }

    public int getHeight(Node root) {
        if (root == null) return -1;

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }

    public int getLevel(Node root) {
        if (root == null) return -1;
        int left = getLevel(root.left);
        int right = getLevel(root.right);
        return Math.max(left, right) + 1;
    }

  
    public int getNodeLevel(Node root, int key, int level) {
        if (root == null) return -1;
        if (root.data == key) return level;

        int left = getNodeLevel(root.left, key, level + 1);
        if (left != -1) return left;

        return getNodeLevel(root.right, key, level + 1);
    }

    public static void main(String[] args) {
        CheckHeightandLvel tree = new CheckHeightandLvel();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        int height = tree.getHeight(tree.root);
        System.out.println("Height of the BST is: " + height);

        int level = tree.getLevel(tree.root);
        System.out.println("Level of the BST is: " + level);

    }
}
