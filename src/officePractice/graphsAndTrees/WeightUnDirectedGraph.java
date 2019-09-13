package graphsAndTrees;

import java.util.LinkedList;

public class WeightUnDirectedGraph {
  public static void main(String[] args) {
    Graph1 graph = new Graph1(5);
    graph.addEdge(0,1, 10);
    graph.addEdge(0,4, 20);
    graph.addEdge(1,2, 30);
    graph.addEdge(1,3, 40);
    graph.addEdge(1,4, 50);
    graph.addEdge(2,3, 60);
    graph.addEdge(3,4, 70);
    
    /*graph.vertices[0].add(new Edge(4, 20));
    graph.vertices[1].add(new Edge(2, 30));
    graph.vertices[1].add(new Edge(3, 40));
    graph.vertices[1].add(new Edge(4, 50));
    graph.vertices[2].add(new Edge(3, 60));
    graph.vertices[3].add(new Edge(4, 70));*/
    printGraph(graph);
  }

  private static void printGraph(Graph1 graph) {
    for (int i = 0; i < graph.vertices.length; i++) {
      System.out.println(String.format("Edges of vertex %s are", i));

      for (Edge edge : graph.vertices[i]) {
        System.out.println(String.format("vertex %d to vertex %d edge weight is %d", i, edge.vertex, edge.weight));
      }
    }

  }
}

class Graph1 {
  int size;
  LinkedList<Edge> vertices[];

  public Graph1(int size) {
    this.size = size;
    vertices = new LinkedList[size];
    for (int i = 0; i < size; i++) {
      vertices[i] = new LinkedList<Edge>();
    }
  }
  
  public void addEdge(int start, int end, int weight){
    vertices[start].add(new Edge(end, weight));
    vertices[end].add(new Edge(start, weight));
    
  }
}

class Edge {
  int weight;
  int vertex;

  public Edge(int vertex,int weight) {
    this.weight = weight;
    this.vertex = vertex;
  }

}