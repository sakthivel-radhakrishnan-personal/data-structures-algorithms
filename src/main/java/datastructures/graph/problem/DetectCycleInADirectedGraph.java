package datastructures.graph.problem;

import datastructures.graph.impl.AdjacencyList;

import java.util.Stack;

public class DetectCycleInADirectedGraph {

    static boolean isCycleExist(AdjacencyList directedGraph, int startingVertex) {
        int numOfVertices = directedGraph.getNumOfVertices();

        boolean[] visited = new boolean[numOfVertices];
        Stack<Integer> stack = new Stack<>();
        boolean visitedAllNeighbors;

        stack.push(startingVertex);

        while (!stack.isEmpty()) {
            visitedAllNeighbors = false;
            Integer currentVertex = stack.peek();

            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
            }

            for (Integer neighbor : directedGraph.getGraph().get(currentVertex)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                    visitedAllNeighbors = true;
                } else if (visited[neighbor] && stack.contains(neighbor)) {
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
