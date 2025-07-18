package DSA;

public class VowelsRemoving {

    Node head;

    public class Node {
        char data;
        Node Next;

        public Node(char data) {
            this.data = data;
            this.Next = null;
        }
    }

    VowelsRemoving() {
        head = null;
    }

    public void insert(char data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node current = head;
            while (current.Next != null) {
                current = current.Next;
            }
            current.Next = newnode;
        }
    }


    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }


    public void deleteVowels() {
        while (head != null && isVowel(head.data)) {
            head = head.Next;
        }

        Node current = head;
        while (current != null && current.Next != null) {
            if (isVowel(current.Next.data)) {
                current.Next = current.Next.Next;
            } else {
                current = current.Next;
            }
        }
    }

    
    // public void modify(char oldChar, char newChar) {
    //     Node current = head;
    //     while (current != null) {
    //         if (current.data == oldChar) {
    //             current.data = newChar;
    //             return;
    //         }
    //         current = current.Next;
    //     }
    // }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.Next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VowelsRemoving list = new VowelsRemoving();
        list.insert('S');
        list.insert('h');
        list.insert('r');
        list.insert('u');
        list.insert('t');
        list.insert('i');
        list.insert('k');

        System.out.print("Original List: ");
        list.printList(); 

        list.deleteVowels();
        System.out.print("After Deletion of Vowels: ");
        list.printList(); 

    }
}
