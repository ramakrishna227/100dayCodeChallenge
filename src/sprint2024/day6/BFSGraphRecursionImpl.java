package sprint2024.day6;

import java.util.*;

public class BFSGraphRecursionImpl {
    class Edge {
        int source, dest;

        public Edge(int source, int dest) {
            this.source = source;
            this.dest = dest;
        }
    }

    class Graph {
        List<List<Integer>> adjList = null;

        Graph(List<Edge> edges, int n) {
            adjList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adjList.add(new ArrayList<>());
            }
            for (Edge edge : edges) {
                int src = edge.source;
                int dest = edge.dest;
                adjList.get(src).add(dest);
                adjList.get(dest).add(src);
            }
        }
    }

    public static void recursiveBFS(Graph graph, Queue<Integer> q, boolean[] discovered) {
        if (q.isEmpty()) {
            return;
        }
        int v = q.poll();
        System.out.print(v + " ");
        //do fo every edge (v, u)
        for (int u : graph.adjList.get(v)) {
            if (!discovered[u]) {
                discovered[u] = true;
                q.add(u);
            }
        }
        recursiveBFS(graph, q, discovered);
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new BFSGraphRecursionImpl().new Edge(1, 2), new BFSGraphRecursionImpl().new Edge(1, 3), new BFSGraphRecursionImpl().new Edge(1, 4), new BFSGraphRecursionImpl().new Edge(2, 5),
                new BFSGraphRecursionImpl().new Edge(2, 6), new BFSGraphRecursionImpl().new Edge(5, 9), new BFSGraphRecursionImpl().new Edge(5, 10), new BFSGraphRecursionImpl().new Edge(4, 7),
                new BFSGraphRecursionImpl().new Edge(4, 8), new BFSGraphRecursionImpl().new Edge(7, 11), new BFSGraphRecursionImpl().new Edge(7, 12)
                // vertex 0, 13, and 14 are single nodes
        );

        int n = 15;
        Graph graph = new BFSGraphRecursionImpl().new Graph(edges, n);
        boolean[] discovered = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (discovered[i] == false) {
                discovered[i] = true;
                q.add(i);
                recursiveBFS(graph, q, discovered);
            }
        }
    }

}
