package DSA.Graphs;
import java.util.*;

public class BasicStruct {

    HashMap<Integer, LinkedList<Integer>> map;

    BasicStruct() {
        map = new HashMap<>();
    }

    void addVertex(int u) {
        map.putIfAbsent(u, new LinkedList<>());
    }

    void addEdge(int u, int v) {
        addVertex(u);
        addVertex(v);
        map.get(u).add(v); // Directed edge from u to v
        // If you want undirected edges, uncomment this:
        // map.get(v).add(u);
    }

    void display() {
        for (int vertex : map.keySet()) {
            System.out.print(vertex + " -> ");
            for (int connected : map.get(vertex)) {
                System.out.print(connected + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BasicStruct graph = new BasicStruct();
         
        
        graph.addVertex(1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        
        
        graph.addVertex(2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        
        graph.addVertex(4);
        graph.addEdge(4, 2);
      

    
        graph.addVertex(10);

        graph.display();
        sc.close();
    }
}
