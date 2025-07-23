package DSA.Graphs;
import java.util.*;

public class Search {
    HashMap<Integer, List<Integer>> graph;

    public Search() {
        graph = new HashMap<>();
    }

    void addEdge(int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());

        graph.get(u).add(v);
        graph.get(v).add(u); 
    }

    void printSearch(int src, int dest) {
        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        dfs(src, dest, visited, path);
    }

    void dfs(int current, int dest, Set<Integer> visited, List<Integer> path) {
        visited.add(current);
        path.add(current);

        if (current == dest) {
            System.out.println(path);
        } else {
            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    dfs(neighbor, dest, visited, path);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {
        Search g = new Search();

        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        int start = 0;
        int end = 4;

        System.out.println("All paths from " + start + " to " + end + ":");
        g.printSearch(start, end);
    }
}
