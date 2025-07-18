package DSA;
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class RightRotateDLL {
    Node head;
    Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public void rotateRight(int k) {
        if (head == null || head.next == null || k == 0) {
            return;
        }

        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        k = k % length;
        if (k == 0) {
            return;
        }

        Node newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        tail.next = head;
        head.prev = tail;

        newTail.next = null;
        newHead.prev = null;

        head = newHead;
        tail = newTail;
    }

    
    public static void main(String[] args) {
        RightRotateDLL list = new RightRotateDLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.print("Original List: ");
        list.printList();

        list.rotateRight(2);

        System.out.print("After Rotating Right by 2: ");
        list.printList();
    }
}
