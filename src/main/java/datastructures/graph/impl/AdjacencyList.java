package datastructures.graph.impl;

import java.util.*;

public class AdjacencyList {

    private final List<List<Integer>> graph;

    private final int numOfNodes;

    public AdjacencyList(Integer numOfNodes) {
        this.graph = new ArrayList<>(numOfNodes);
        this.numOfNodes = numOfNodes;

        for (int i = 0; i < numOfNodes; i++) {
            graph.add(new LinkedList<>());
        }
    }

    public void addEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        graph.get(src).add(dest);
        graph.get(dest).add(src); // For undirected graph
    }

    public void removeEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        graph.get(src).remove(dest);
        graph.get(dest).remove(src); // For undirected graph
    }

    public boolean isEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        return graph.get(src).contains(dest);
    }

    public List<Integer> bfs(Integer startNode) {
        List<Integer> bfsOrder = new ArrayList<>(numOfNodes);
        boolean[] visited = new boolean[numOfNodes];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            bfsOrder.add(currentNode);
            for (Integer neighbor : graph.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return bfsOrder;
    }

    public List<Integer> dfs(Integer startNode) {
        List<Integer> dfsOrder = new ArrayList<>(numOfNodes);
        boolean[] visited = new boolean[numOfNodes];
        Stack<Integer> stack = new Stack<>();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            startNode = stack.pop();

            if (!visited[startNode]) {
                dfsOrder.add(startNode);
                visited[startNode] = true;
            }

            for (Integer neighbor : graph.get(startNode)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
        return dfsOrder;
    }
}
