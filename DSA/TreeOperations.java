package DSA;

public class TreeOperations {
    Node Root;

    TreeOperations() {
        this.Root = null;
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {
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

    public int sumOfOdd(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfOdd(root.left);
        int rightSum = sumOfOdd(root.right);
        int current = (root.data % 2 != 0) ? root.data : 0;

        return leftSum + rightSum + current;
    }

    public int sumOfEven(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfEven(root.left);
        int rightSum = sumOfEven(root.right);
        int current = (root.data % 2 == 0) ? root.data : 0;

        return leftSum + rightSum + current;
    }

    public int sumOfPrime(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfPrime(root.left);
        int rightSum = sumOfPrime(root.right);
        int current = isPrime(root.data) ? root.data : 0;

        return leftSum + rightSum + current;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeOperations tree = new TreeOperations();

        tree.Root = tree.insert(tree.Root, 1);
        tree.Root = tree.insert(tree.Root, 5);
        tree.Root = tree.insert(tree.Root, 2);
        tree.Root = tree.insert(tree.Root, 7);
        tree.Root = tree.insert(tree.Root, 6);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.Root);
        System.out.println();

        int oddSum = tree.sumOfOdd(tree.Root);
        System.out.println("Sum of odd nodes: " + oddSum);

        int evenSum = tree.sumOfEven(tree.Root);
        System.out.println("Sum of even nodes: " + evenSum);

        int primeSum = tree.sumOfPrime(tree.Root);
        System.out.println("Sum of prime number nodes: " + primeSum);
    }
}
