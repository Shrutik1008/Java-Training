package DSA;

public class PalindromeDLL {

    class Node {
        char data;
        Node prev, next;

        public Node(char data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public boolean isPalindrome() {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && right.next != left) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public void buildFromString(String str) {
        for (char ch : str.toCharArray()) {
            insert(ch);
        }
    }

    public static void main(String[] args) {
        PalindromeDLL dll = new PalindromeDLL();
        String input = "madam";
        dll.buildFromString(input);

        if (dll.isPalindrome()) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
