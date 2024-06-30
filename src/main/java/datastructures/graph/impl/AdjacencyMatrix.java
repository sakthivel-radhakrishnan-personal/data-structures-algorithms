package datastructures.graph.impl;

public class AdjacencyMatrix {

    private final boolean[][] graph;

    AdjacencyMatrix(int numOfNodes) {
        this.graph = new boolean[numOfNodes][numOfNodes];
    }

    public void addEdge(int src, int dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        this.graph[src][dest] = true;
        this.graph[dest][src] = true; // For undirected graph
    }

    public void removeEdge(int src, int dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        this.graph[src][dest] = false;
        this.graph[dest][src] = false; // For undirected graph
    }

    public boolean isEdge(int src, int dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        return this.graph[src][dest];
    }
}
