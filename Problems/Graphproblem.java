package Problems;
import java.util.*;


public class Graphproblem {
   HashMap<Integer,LinkedList<Integer>>map= new HashMap<>();
    Graphproblem(){
        map =new HashMap<>();
    }

   public void insertNode(int u,int v){
        if(map.containsKey(u)){
            map.get(u).add(v);

        }else{
            LinkedList<Integer>list=new LinkedList<>();
            list.add(v);
            map.put(u, list);

        }


    }
    public void deletedata(int u,int v){

            if(map.get(u).contains(v)){
                map.get(u).remove(v);
            }
        
    }
    public void deleteNode(int u){
        if(map.containsKey(u)){
            map.remove(u);
          deletedata(u);

          
        }
    }



    void display() {
        for (int vert : map.keySet()) {
            System.out.print(vert + " -> ");
            for (int connected : map.get(vert)) {
                System.out.print(connected + " ");
            }
            System.out.println();
        }
    }


public static void main(String[] args) {
    Graphproblem g = new Graphproblem();

    g.insertNode(1,2);
    g.insertNode(2,3);
    g.insertNode(3,4);
    g.insertNode(5,4);
    g.insertNode(4,3);
    g.insertNode(3,2);

    g.display();
    g.deleteNode(1);
    g.deleteNode(2);
    System.out.println("After Deletion:");
 g.display();
   
}
}
