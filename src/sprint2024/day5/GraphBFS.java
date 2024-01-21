package sprint2024.day5;

import java.util.Iterator;
import java.util.LinkedList;


public class GraphBFS {
    public static void main(String[] args) {
        Graph g = new GraphBFS().new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("BFS strating from vertex 2");
        g.BFS(2);
    }

    class Graph {
        //No of vertices
        private int V;
        //Adjacents List
        private LinkedList<Integer> adj[];

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        void BFS(int s) {
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<>();
            visited[s] = true;
            queue.add(s);
            while (queue.size() != 0) {
                s = queue.poll();
                System.out.print(s + " ");
                Iterator<Integer> itr = adj[s].listIterator();
                while (itr.hasNext()) {
                    int n = itr.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }

        }
    }
}
