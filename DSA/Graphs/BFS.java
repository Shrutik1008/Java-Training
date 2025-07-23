package DSA.Graphs;

import java.util.*;

public class BFS {
    HashMap<Integer, LinkedList<Integer>> map;

    public BFS() {
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

    void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : map.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFS graph = new BFS();

        int[][] edges = {
            {1, 2},
            {1, 3},
            {2, 4},
            {3, 5},
            {4, 5}
        };
        
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }

        int source = 1;
        graph.bfs(source);
    }
}
