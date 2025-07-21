package DSA;

public class AlphabetArrangement {
    Node Root;

    AlphabetArrangement() {
        this.Root = null;
    }

    class Node {
        String data;
        Node left;
        Node right;

        Node(String data) {
            this.data = data.toLowerCase(); 
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, String data) {
        data = data.toLowerCase();
        if (root == null) {
            return new Node(data);
        } else if (data.compareTo(root.data) < 0) {
            root.left = insert(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
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

    public static void main(String[] args) {
        AlphabetArrangement alpha = new AlphabetArrangement();

        String str = "I Am Smart Boy";

        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            }

            if (ch == ' ' || i == str.length() - 1) {
                if (!word.isEmpty()) {
                    alpha.Root = alpha.insert(alpha.Root, word);
                    word = "";
                }
            }
        }

        System.out.print("Words in Ascending Order: ");
        alpha.inorder(alpha.Root);
    }
}
