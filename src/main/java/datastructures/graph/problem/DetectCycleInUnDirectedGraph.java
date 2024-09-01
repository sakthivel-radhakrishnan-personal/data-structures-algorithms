package datastructures.graph.problem;

import datastructures.graph.impl.AdjacencyList;
import datastructures.graph.impl.Edge;

import java.util.Stack;

public class DetectCycleInUnDirectedGraph {

    static boolean isCycleExist(AdjacencyList undirectedGraph, int startingVertex) {
        int numOfVertices = undirectedGraph.getNumOfVertices();
        boolean[] visited = new boolean[numOfVertices];
        Stack<Integer> stack = new Stack<>();
        boolean visitedAllNeighbors;
        Integer currentVertex;

        stack.push(startingVertex);

        while (!stack.isEmpty()) {
            visitedAllNeighbors = false;
            currentVertex = stack.peek();

            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
            }

            for (Edge neighbor : undirectedGraph.getGraph().get(currentVertex)) {
                if (!visited[neighbor.to]) {
                    stack.push(neighbor.to);
                    visitedAllNeighbors = true;
                } else if (visited[neighbor.to] && stack.contains(neighbor.to)) {
                    return true;
                }
            }

            if (!visitedAllNeighbors) {
                stack.pop();
            }
        }
        return false;
    }
}
