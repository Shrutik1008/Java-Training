package DSA;

public class LinkedList {

    Node head;

    public class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insert(int data) {
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


    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.Next;
            return;
        }

        
        Node current = head;
        while (current.Next != null) {
            if (current.Next.data == data) {
                current.Next = current.Next.Next;
                return;
            }
            current = current.Next;
        }
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.Next;
        }
        System.out.println();
    }

    int temp;
    public void Modify(int data,int temp){
        Node current = head;
        
        while(current!=null){
            if (current.data == data) {
                current.data = temp;
                return;
            }
            current = current.Next;
        }
    }

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Original List: ");
        list.printList(); 

        list.delete(10); 
        list.delete(30); 
        list.delete(50); 

        System.out.print("After Deletion: ");
        list.printList(); 

        
        System.out.print("After Modification: ");
        list.Modify(20,60);
        list.printList(); 

    }
}
