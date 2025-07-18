package DSA;

public class Primenoinlinkedlist {

    Node Head;

    public class Node {
        Node Next;
        int data;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        if (Head == null) {
            Head = newnode;
        } else {
            Node current = Head;
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = newnode;
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1) 
        return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    
    public void printPrimes() {
        Node current = Head;
        while (current != null) {
            if (isPrime(current.data)) {
                System.out.print(current.data + " ");
            }
            current = current.Next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Primenoinlinkedlist list = new Primenoinlinkedlist();
        list.insert(3);
        list.insert(4);
        list.insert(7);
        list.insert(10);
        list.insert(17);

        System.out.print("Prime Numbers in the List: ");
        list.printPrimes();
    }
}
