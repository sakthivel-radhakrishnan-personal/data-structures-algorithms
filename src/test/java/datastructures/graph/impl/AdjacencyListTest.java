package datastructures.graph.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacencyListTest {
    @Test
    void testAddEdge() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(1, 2);

        assertTrue(adjacencyList.isEdge(0, 1));
        assertTrue(adjacencyList.isEdge(1, 0));

        assertTrue(adjacencyList.isEdge(1, 2));
        assertTrue(adjacencyList.isEdge(2, 1));

        assertFalse(adjacencyList.isEdge(2, 2));
    }

    @Test
    void testRemoveEdge() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(1, 2);

        assertTrue(adjacencyList.isEdge(0, 1));
        assertTrue(adjacencyList.isEdge(1, 0));

        assertTrue(adjacencyList.isEdge(1, 2));
        assertTrue(adjacencyList.isEdge(2, 1));

        adjacencyList.removeEdge(0, 1);

        assertFalse(adjacencyList.isEdge(0, 1));
        assertFalse(adjacencyList.isEdge(1, 0));

        adjacencyList.removeEdge(1, 2);

        assertFalse(adjacencyList.isEdge(1, 2));
        assertFalse(adjacencyList.isEdge(2, 1));
    }

    @Test
    void testIsEdge() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        adjacencyList.addEdge(1, 3);
        adjacencyList.addEdge(2, 4);

        assertTrue(adjacencyList.isEdge(1, 3));
        assertTrue(adjacencyList.isEdge(3, 1));
        assertTrue(adjacencyList.isEdge(2, 4));
        assertTrue(adjacencyList.isEdge(4, 2));

        assertFalse(adjacencyList.isEdge(2, 2));
        assertFalse(adjacencyList.isEdge(3, 3));
        assertFalse(adjacencyList.isEdge(0, 1));
        assertFalse(adjacencyList.isEdge(1, 0));
    }

    @Test
    void testExceptionForNegativeEdge() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        assertThrows(RuntimeException.class, () -> adjacencyList.addEdge(-1, 3));
        assertThrows(RuntimeException.class, () -> adjacencyList.addEdge(1, -3));
        assertThrows(RuntimeException.class, () -> adjacencyList.removeEdge(-1, 3));
        assertThrows(RuntimeException.class, () -> adjacencyList.removeEdge(1, -3));
        assertThrows(RuntimeException.class, () -> adjacencyList.isEdge(-1, 3));
        assertThrows(RuntimeException.class, () -> adjacencyList.isEdge(1, -3));
    }
}
