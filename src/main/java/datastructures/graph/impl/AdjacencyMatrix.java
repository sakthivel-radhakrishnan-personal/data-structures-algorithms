package datastructures.graph.impl;

import java.util.*;

public class AdjacencyMatrix {
    private final boolean[][] graph;

    private final int numOfNodes;

    AdjacencyMatrix(int numOfNodes) {
        this.graph = new boolean[numOfNodes][numOfNodes];
        this.numOfNodes = numOfNodes;
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

    public List<Integer> bfs(int startNode) {
        List<Integer> bfsOrder = new ArrayList<>(numOfNodes);
        boolean[] visited = new boolean[numOfNodes];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            bfsOrder.add(currentNode);
            for (int neighbor = 0; neighbor < numOfNodes; neighbor++) {
                if (graph[currentNode][neighbor] && !visited[neighbor]) {
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
        Integer currentNode = startNode;

        stack.push(currentNode);

        while (!stack.isEmpty()) {
            currentNode = stack.pop();

            if (!visited[currentNode]) {
                dfsOrder.add(currentNode);
                visited[currentNode] = true;
            }

            for (int neighbor = 0; neighbor < numOfNodes; neighbor++) {
                if (graph[currentNode][neighbor] && !visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
        return dfsOrder;
    }
}
