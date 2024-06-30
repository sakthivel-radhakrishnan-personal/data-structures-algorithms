package datastructures.graph.impl;

import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void testBfs() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(0, 2);
        adjacencyList.addEdge(1, 3);
        adjacencyList.addEdge(1, 4);
        adjacencyList.addEdge(2, 4);

        assertEquals(List.of(0, 1, 2, 3, 4), adjacencyList.bfs(0));
        assertEquals(List.of(1, 0, 3, 4, 2), adjacencyList.bfs(1));
        assertEquals(List.of(2, 0, 4, 1, 3), adjacencyList.bfs(2));
        assertEquals(List.of(3, 1, 0, 4, 2), adjacencyList.bfs(3));
    }

    @Test
    void testBfsForDisconnectedGraph() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(0, 2);
        adjacencyList.addEdge(1, 3);
        adjacencyList.addEdge(1, 4);

        List<Integer> bfsOrder = adjacencyList.bfs(0);
        assertEquals(List.of(0, 1, 2, 3, 4), bfsOrder);

        bfsOrder = adjacencyList.bfs(3);
        assertEquals(List.of(3, 1, 0, 4, 2), bfsOrder);
    }

    @Test
    void testBfsForEmptyGraph() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        List<Integer> bfsOrder = adjacencyList.bfs(0);
        assertEquals(List.of(0), bfsOrder);
    }

    @Test
    void testBfsForSingleNodeGraph() {
        AdjacencyList adjacencyList = new AdjacencyList(1);

        List<Integer> bfsOrder = adjacencyList.bfs(0);
        assertEquals(List.of(0), bfsOrder);
    }

    @Test
    void testDfs() {
        AdjacencyList adjacencyList = new AdjacencyList(5);

        adjacencyList.addEdge(1, 0);
        adjacencyList.addEdge(0, 2);
        adjacencyList.addEdge(2, 1);
        adjacencyList.addEdge(0, 3);
        adjacencyList.addEdge(1, 4);

        assertEquals(List.of(0, 3, 2, 1, 4), adjacencyList.dfs(0));
        assertEquals(List.of(1, 4, 2, 0, 3), adjacencyList.dfs(1));
        assertEquals(List.of(2, 1, 4, 0, 3), adjacencyList.dfs(2));
        assertEquals(List.of(3, 0, 2, 1, 4), adjacencyList.dfs(3));
        assertEquals(List.of(4, 1, 2, 0, 3), adjacencyList.dfs(4));
    }
}
