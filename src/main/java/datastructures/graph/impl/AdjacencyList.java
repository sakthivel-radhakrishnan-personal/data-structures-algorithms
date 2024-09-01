package datastructures.graph.impl;

import java.util.*;

public class AdjacencyList {

    private final Map<Object, List<Edge>> graph;

    private final int numOfVertices;

    private final boolean isUnDirected;

    public AdjacencyList(Integer numOfVertices, boolean isUnDirected) {
        this.graph = new HashMap<>();
        this.numOfVertices = numOfVertices;
        this.isUnDirected = isUnDirected;

        for (int i = 0; i < numOfVertices; i++) {
            graph.put(i, new ArrayList<>());
        }
    }

    public Map<Object, List<Edge>> getGraph() {
        return graph;
    }

    public int getNumOfVertices() {
        return numOfVertices;
    }

    public void addEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        graph.get(src).add(new Edge(src, dest));
        if (isUnDirected) {
            graph.get(dest).add(new Edge(dest, src)); // For undirected graph
        }
    }

    void removeEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }

        Edge edge;
        edge = getEdge(src, dest);

        if (edge != null) {
            graph.get(src).remove(edge);
        }

        if (isUnDirected) {
            // For undirected graph
            edge = getEdge(dest, src);

            if (edge != null) {
                graph.get(dest).remove(edge);
            }
        }
    }

    Edge getEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }
        List<Edge> edges = graph.get(src);
        for (Edge edge : edges) {
            if (edge.to == dest) {
                return edge;
            }
        }
        return null;
    }

    boolean isEdge(Integer src, Integer dest) {
        if (src < 0 || dest < 0) {
            throw new RuntimeException("Negative edge is not allowed");
        }

        List<Edge> edges = graph.get(src);

        for (Edge edge : edges) {
            if (edge.to == dest) {
                return true;
            }
        }
        return false;
    }

    List<Integer> bfs(Integer startNode) {
        List<Integer> bfsOrder = new ArrayList<>(numOfVertices);
        boolean[] visited = new boolean[numOfVertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            bfsOrder.add(currentNode);
            for (Edge neighbor : graph.get(currentNode)) {
                if (!visited[neighbor.to]) {
                    visited[neighbor.to] = true;
                    queue.add(neighbor.to);
                }
            }
        }
        return bfsOrder;
    }

    List<Integer> dfs(Integer startNode) {
        List<Integer> dfsOrder = new ArrayList<>(numOfVertices);
        boolean[] visited = new boolean[numOfVertices];
        Stack<Integer> stack = new Stack<>();
        Integer currentNode = startNode;

        stack.push(currentNode);

        while (!stack.isEmpty()) {
            currentNode = stack.pop();

            if (!visited[currentNode]) {
                dfsOrder.add(currentNode);
                visited[currentNode] = true;
            }

            for (Edge neighbor : graph.get(currentNode)) {
                if (!visited[neighbor.to]) {
                    stack.push(neighbor.to);
                }
            }
        }
        return dfsOrder;
    }

    public void dfsRecursive(Integer at, boolean[] visited, List<Integer> result, Map<Object, List<Edge>> graph) {
        visited[at] = true;
        result.add(at);

        for (Edge edge : graph.get(at)) {
            if (!visited[edge.to]) {
                dfsRecursive(edge.to, visited, result, graph);
            }
        }
    }
}
