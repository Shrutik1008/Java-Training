package DSA;

public class Boundarylevel {
     Node Root;

    Boundarylevel(){
        this.Root = null;
    }
    class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

         public Node insert(Node Root,int data){

            if(Root ==null){
                Root = new Node(data);
                return Root;
            }else if(Root.data>data){
                Root.left = insert(Root.left,data);

            }else if(Root.data<data){
                Root.right =insert(Root.right,data);
            }

            return Root;

        }

        public void Traverse(){
            if(Root!=null){
                System.out.println(Root.data);
                System.out.println("Left Traversal");
                

        }


    }
}
}