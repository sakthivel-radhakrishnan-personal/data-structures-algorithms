package datastructures.graph.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyList {

    private final List<List<Integer>> graph;

    public AdjacencyList(Integer numOfNodes) {
        this.graph = new ArrayList<>(numOfNodes);

        for (int i = 0; i < numOfNodes; i++) {
            this.graph.add(new LinkedList<>());
        }
    }

    public void addEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        this.graph.get(src).add(dest);
        this.graph.get(dest).add(src); // For undirected graph
    }

    public void removeEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        this.graph.get(src).remove(dest);
        this.graph.get(dest).remove(src); // For undirected graph
    }

    public boolean isEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        return this.graph.get(src).contains(dest);
    }
}
