package DSA.Graphs;

import java.util.*;

public class Dfs {
    HashMap<Integer, LinkedList<Integer>> map;

    public Dfs() {
        map = new HashMap<>();
    }


    void addVertex(int u) {
        map.putIfAbsent(u, new LinkedList<>());
    }

    
    void addEdge(int u, int v) {
        addVertex(u);
        addVertex(v);
        map.get(u).add(v);
        map.get(v).add(u); 
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

    
    public boolean dfsPathExists(int src, int dest) {
        Set<Integer> visited = new HashSet<>();
        return dfsHelper(src, dest, visited);
    }


    private boolean dfsHelper(int current, int dest, Set<Integer> visited) {
        if (current == dest) return true;

        visited.add(current);

        for (int neighbor : map.get(current)) {
            if (!visited.contains(neighbor)) {
                if (dfsHelper(neighbor, dest, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dfs graph = new Dfs();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter " + e + " edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        graph.display();

        System.out.print("Enter source node: ");
        int src = sc.nextInt();

        System.out.print("Enter destination node: ");
        int dest = sc.nextInt();

        if (graph.dfsPathExists(src, dest)) {
            System.out.println("Path exists from " + src + " to " + dest);
        } else {
            System.out.println("No path exists from " + src + " to " + dest);
        }

        sc.close();
    }
}
