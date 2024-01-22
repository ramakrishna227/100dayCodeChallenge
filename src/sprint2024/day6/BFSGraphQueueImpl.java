package sprint2024.day6;

import java.util.*;

public class BFSGraphQueueImpl {
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

    // Perform BFS starting from vertex v
    public static void BFS(Graph graph, int v, boolean[] discovered) {
        Queue<Integer> q = new ArrayDeque<>();
        discovered[v] = true;
        q.add(v);
        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int u : graph.adjList.get(v)) {
                if (!discovered[u]) {
                    discovered[u] = true;
                    q.add(u);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new BFSGraphQueueImpl().new Edge(1, 2), new BFSGraphQueueImpl().new Edge(1, 3), new BFSGraphQueueImpl().new Edge(1, 4), new BFSGraphQueueImpl().new Edge(2, 5),
                new BFSGraphQueueImpl().new Edge(2, 6), new BFSGraphQueueImpl().new Edge(5, 9), new BFSGraphQueueImpl().new Edge(5, 10), new BFSGraphQueueImpl().new Edge(4, 7),
                new BFSGraphQueueImpl().new Edge(4, 8), new BFSGraphQueueImpl().new Edge(7, 11), new BFSGraphQueueImpl().new Edge(7, 12)
                // vertex 0, 13, and 14 are single nodes
        );
        int n = 15;
        Graph graph = new BFSGraphQueueImpl().new Graph(edges, n);
        boolean[] discovered = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (discovered[i] == false) {
                BFS(graph, i, discovered);
            }
        }
    }
}
