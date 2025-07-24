package Problems;

public class traversalsWitHRecursion {
    Node root;

        traversalsWitHRecursion ts =new traversalsWitHRecursion();
        traversalsWitHRecursion(){
            
        root = new Node(0);
    }
    public static void main(String[] args) {

        traversalsWitHRecursion ts =new traversalsWitHRecursion();
             ts.root = ts.insert(ts.root, 1);
             ts.root = ts.insert(ts.root, 5);
        }
         class Node{
            int data;
            Node left;
            Node right;

            Node(int data){ 
                this.data = data;
                this.left=null;
                this.right=null;
            }

            public void insert(int data){

            }
    }



 public Node insert(Node root,int data) {
    if(root==null){
        return new Node(data);
    }else if(root.data>data){
        root.left=insert(root.left,data);
    }else if(root.data<data){
        root.right=insert(root.right,data);
    }
    return root;
    }
}











