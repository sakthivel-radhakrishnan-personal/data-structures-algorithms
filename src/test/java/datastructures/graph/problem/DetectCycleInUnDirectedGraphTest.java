package datastructures.graph.problem;

import datastructures.graph.impl.AdjacencyList;
import org.junit.jupiter.api.Test;

import static datastructures.graph.problem.DetectCycleInADirectedGraph.isCycleExist;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectCycleInUnDirectedGraphTest {

    private final int ITERATIONS = 1_00_000;

    @Test
    void testIsCycleExist() {
        AdjacencyList directedGraph = new AdjacencyList(4, true);

        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 0);
        directedGraph.addEdge(2, 3);
        directedGraph.addEdge(3, 3);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertTrue(isCycleExist(directedGraph, (int) (Math.random() * 4)));
        }


        AdjacencyList directedGraph1 = new AdjacencyList(5, true);

        directedGraph1.addEdge(1, 0);
        directedGraph1.addEdge(0, 2);
        directedGraph1.addEdge(2, 1);
        directedGraph1.addEdge(0, 3);
        directedGraph1.addEdge(3, 4);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertTrue(isCycleExist(directedGraph1, (int) (Math.random() * 5)));
        }


        AdjacencyList directedGraph4 = new AdjacencyList(6, true);
        directedGraph4.addEdge(0, 1);
        directedGraph4.addEdge(0, 2);
        directedGraph4.addEdge(1, 3);
        directedGraph4.addEdge(4, 1);
        directedGraph4.addEdge(4, 5);
        directedGraph4.addEdge(5, 3);
        directedGraph4.addEdge(3, 4);
        directedGraph4.addEdge(2, 4);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertTrue(isCycleExist(directedGraph4, (int) (Math.random() * 6)));
        }
    }

    @Test
    void testCycleNotExists() {

        AdjacencyList directedGraph1 = new AdjacencyList(4, true);

        directedGraph1.addEdge(0, 1);
        directedGraph1.addEdge(1, 2);
        directedGraph1.addEdge(2, 3);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertFalse(isCycleExist(directedGraph1, (int) (Math.random() * 2)));
        }


        AdjacencyList directedGraph2 = new AdjacencyList(4, true);

        directedGraph2.addEdge(0, 1);
        directedGraph2.addEdge(0, 2);
        directedGraph2.addEdge(1, 2);
        directedGraph2.addEdge(2, 3);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertFalse(isCycleExist(directedGraph2, (int) (Math.random() * 4)));
        }

        AdjacencyList directedGraph3 = new AdjacencyList(6, true);
        directedGraph3.addEdge(0, 1);
        directedGraph3.addEdge(0, 2);
        directedGraph3.addEdge(1, 3);
        directedGraph3.addEdge(4, 1);
        directedGraph3.addEdge(4, 5);
        directedGraph3.addEdge(5, 3);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertFalse(isCycleExist(directedGraph3, (int) (Math.random() * 6)));
        }

        AdjacencyList directedGraph5 = new AdjacencyList(6, true);
        directedGraph5.addEdge(0, 1);
        directedGraph5.addEdge(0, 2);
        directedGraph5.addEdge(1, 3);
        directedGraph5.addEdge(4, 1);
        directedGraph5.addEdge(4, 5);
        directedGraph5.addEdge(5, 3);

        for (int i = 1; i <= ITERATIONS; i++) {
            assertFalse(isCycleExist(directedGraph5, (int) (Math.random() * 6)));
        }
    }
}
