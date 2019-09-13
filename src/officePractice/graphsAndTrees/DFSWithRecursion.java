package graphsAndTrees;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSWithRecursion {
  public static void main(String[] args) {
    Graph2 graph = new Graph2(4);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);

    graph.dfs(2);
  }

}

class Graph2 {
  static int size;
  static LinkedList<Integer> vertices[];

  public Graph2(int size) {
    this.size = size;
    vertices = new LinkedList[size];
    for (int i = 0; i < size; i++) {
      vertices[i] = new LinkedList<Integer>();
    }
  }

  void addEdge(int start, int end) {
    vertices[start].add(end);
  }

  public static void dfs(int i) {
    boolean[] visited = new boolean[size];
    dfsUtil(i, visited);
  }

  private static void dfsUtil(int i, boolean[] visited) {
    System.out.println(String.format("visited node %d", i));
    visited[i] = true;
    Iterator itr = vertices[i].listIterator();
    while (itr.hasNext()) {
      int next = (int) itr.next();
      if (!visited[next]) {
        dfsUtil(next, visited);
      }
    }

  }

}