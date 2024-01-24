package sprint2024.day8;

import java.util.LinkedList;
import java.util.Stack;

public class DFSGraphStack {
    private int V;
    private LinkedList<Integer>[] adj;

    DFSGraphStack(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfsUtil(int start, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.empty()) {
            int top = stack.pop();
            if (visited[top] != true) {
                System.out.print(top + " ");
                visited[top] = true;
                for (int n : adj[top]) {
                    stack.push(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFSGraphStack g = new DFSGraphStack(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("DFS following vertex 2 is ");

        boolean visited[] = new boolean[g.V];
        g.dfsUtil(2, visited);
    }

}
