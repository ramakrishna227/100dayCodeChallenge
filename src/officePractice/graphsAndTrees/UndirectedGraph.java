package graphsAndTrees;

import java.util.LinkedList;

public class UndirectedGraph {
  public static void main(String[] args) {
    Graph graph = new Graph(5);
    graph.addEdge(graph, 0, 1);
    graph.addEdge(graph, 0, 4);
    graph.addEdge(graph, 1, 2);
    graph.addEdge(graph, 1, 3);
    graph.addEdge(graph, 1, 4);
    graph.addEdge(graph, 2, 3);
    graph.addEdge(graph, 3, 4);
    PrintGraph(graph);
  }

  private static void PrintGraph(Graph graph) {
for(int i=0; i<graph.vertices.length; i++) {
  graph.vertices[i].forEach(s->{
    System.out.print(s +"->");
  });
  System.out.println();
}
  }
}

class Graph {
  int size;
  LinkedList<Integer> vertices[];

  public Graph(int size) {
    this.size = size;
    vertices = new LinkedList[size];
    for (int i = 0; i < size; i++) {
      vertices[i] = new LinkedList<Integer>();
    }
  }

  public void addEdge(Graph graph, int src, int dest) {
    graph.vertices[src].add(dest);
    graph.vertices[dest].add(src);
  }

}