package DSA;

public class BinaryTree{
    Node Root;

    BinaryTree(){
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

        public void inorder(Node Root){
            if(Root !=null){
                inorder(Root.left);
                System.out.print(Root.data + " ");
                inorder(Root.right);
            }
            }

        public void preorder(Node Root){
            if(Root !=null){
                System.out.print(Root.data + " ");
                preorder(Root.left);
                preorder(Root.right);
        }
        }
        public void postorder(Node Root){
            if(Root !=null){
                postorder(Root.left);
                postorder(Root.right);
                System.out.print(Root.data + " ");
            }
        }



        public static void main(String[] args) {
            
            BinaryTree BT =new BinaryTree();

            BT.Root = BT.insert(BT.Root, 50);
           BT.Root = BT.insert(BT.Root, 30);
           BT.Root = BT.insert(BT.Root, 20);
           BT.Root = BT.insert(BT.Root, 40);
            BT.Root =BT.insert(BT.Root, 70);
           BT.Root = BT.insert(BT.Root, 60);


           System.out.print("Inorder Tree : ");
            BT.inorder(BT.Root);
            
            System.out.println();
             System.out.print("Preorder Tree : ");
            BT.preorder(BT.Root);

            System.out.println();
            System.out.print("PostOrder Tree : ");
            BT.postorder(BT.Root);
        }
    }



