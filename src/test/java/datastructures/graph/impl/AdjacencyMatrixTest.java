package datastructures.graph.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacencyMatrixTest {

    @Test
    void testAddEdge() {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);

        adjacencyMatrix.addEdge(0, 1);
        adjacencyMatrix.addEdge(1, 2);

        assertTrue(adjacencyMatrix.isEdge(0, 1));
        assertTrue(adjacencyMatrix.isEdge(1, 0));

        assertTrue(adjacencyMatrix.isEdge(1, 2));
        assertTrue(adjacencyMatrix.isEdge(2, 1));

        assertFalse(adjacencyMatrix.isEdge(2, 2));
    }

    @Test
    void testRemoveEdge() {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);

        adjacencyMatrix.addEdge(0, 1);
        adjacencyMatrix.addEdge(1, 2);

        assertTrue(adjacencyMatrix.isEdge(0, 1));
        assertTrue(adjacencyMatrix.isEdge(1, 0));

        assertTrue(adjacencyMatrix.isEdge(1, 2));
        assertTrue(adjacencyMatrix.isEdge(2, 1));

        adjacencyMatrix.removeEdge(0, 1);

        assertFalse(adjacencyMatrix.isEdge(0, 1));
        assertFalse(adjacencyMatrix.isEdge(1, 0));

        adjacencyMatrix.removeEdge(1, 2);

        assertFalse(adjacencyMatrix.isEdge(1, 2));
        assertFalse(adjacencyMatrix.isEdge(2, 1));
    }

    @Test
    void testIsEdge() {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);

        adjacencyMatrix.addEdge(1, 3);
        adjacencyMatrix.addEdge(2, 4);

        assertTrue(adjacencyMatrix.isEdge(1, 3));
        assertTrue(adjacencyMatrix.isEdge(3, 1));
        assertTrue(adjacencyMatrix.isEdge(2, 4));
        assertTrue(adjacencyMatrix.isEdge(4, 2));

        assertFalse(adjacencyMatrix.isEdge(2, 2));
        assertFalse(adjacencyMatrix.isEdge(3, 3));
        assertFalse(adjacencyMatrix.isEdge(0, 1));
        assertFalse(adjacencyMatrix.isEdge(1, 0));
    }

    @Test
    void testExceptionForNegativeEdge() {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);

        assertThrows(RuntimeException.class, () -> adjacencyMatrix.addEdge(-1, 1));
        assertThrows(RuntimeException.class, () -> adjacencyMatrix.addEdge(1, -1));
        assertThrows(RuntimeException.class, () -> adjacencyMatrix.addEdge(-1, -1));

        assertThrows(RuntimeException.class, () -> adjacencyMatrix.removeEdge(-1, 1));
        assertThrows(RuntimeException.class, () -> adjacencyMatrix.removeEdge(1, -1));
        assertThrows(RuntimeException.class, () -> adjacencyMatrix.removeEdge(-1, -1));

        assertThrows(RuntimeException.class, () -> adjacencyMatrix.isEdge(-1, 1));
        assertThrows(RuntimeException.class, () -> adjacencyMatrix.isEdge(1, -1));
        assertThrows(RuntimeException.class, () -> adjacencyMatrix.isEdge(-1, -1));
    }
}
