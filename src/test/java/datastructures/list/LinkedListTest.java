package datastructures.list;

import exception.EmptyListException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAdd() {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());
    }

    @Test
    void testRemoveElementFromHead() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(1));

        assertEquals(3, list.size());
    }

    @Test
    void testRemoveElementFromTail() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(4));

        assertEquals(3, list.size());
    }

    @Test
    void testRemoveElementFromMiddle() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(2));

        assertEquals(3, list.size());
    }

    @Test
    void testRemoveWhenElementIsNotPresent() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(5));

        assertEquals(4, list.size());
    }

    @Test
    void testRemoveElementUsingPositionThrowsExceptionWhenListIsEmpty() {
        List<Integer> list = new LinkedList<>();
        assertThrows(EmptyListException.class, () -> list.remove(1));
    }

    @Test
    void testRemoveElementUsingPositionThrowsExceptionWhenIndexIsInvalid() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        assertThrows(RuntimeException.class, () -> list.remove(2));
    }

    @Test
    void testRemoveElementFromHeadUsingPosition() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(1);

        assertEquals(3, list.size());
    }

    @Test
    void testRemoveElementFromTailUsingPosition() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(4);

        assertEquals(3, list.size());
    }

    @Test
    void testRemoveElementFromMiddleUsingPosition() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        assertEquals(3, list.size());
    }

    @Test
    void testGetElementUsingPositionThrowsExceptionWhenListIsEmpty() {
        List<Integer> list = new LinkedList<>();
        assertThrows(EmptyListException.class, () -> list.get(1));
    }

    @Test
    void testGetElementUsingPositionThrowsExceptionWhenIndexIsInvalid() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        assertThrows(RuntimeException.class, () -> list.get(2));
    }

    @Test
    void testGetHeadElementUsingPosition() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(1, list.get(1));
    }

    @Test
    void testGetTailElementUsingPosition() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.get(4));
    }

    @Test
    void testGetMiddleElementUsingPosition() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(3, list.get(3));
    }

    @Test
    void testAddElementUsingPositionAtHead() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 5);

        assertEquals(5, list.size());

        assertEquals(5, list.get(1));
        assertEquals(1, list.get(2));
        assertEquals(2, list.get(3));
        assertEquals(3, list.get(4));
        assertEquals(4, list.get(5));
    }

    @Test
    void testAddElementUsingPositionAtTail() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5, 5);

        assertEquals(5, list.size());

        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(3, list.get(3));
        assertEquals(4, list.get(4));
        assertEquals(5, list.get(5));
    }

    @Test
    void testAddElementUsingPositionAtMiddle() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3, 5);

        assertEquals(5, list.size());

        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(5, list.get(3));
        assertEquals(3, list.get(4));
        assertEquals(4, list.get(5));
    }

    @Test
    void testAddElementWithGreaterIndexThanSize() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(60, 5);

        assertEquals(5, list.size());

        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(3, list.get(3));
        assertEquals(4, list.get(4));
        assertEquals(5, list.get(5));
    }

    @Test
    void testAddElementWithNegativeIndex() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(-100, 5);

        assertEquals(5, list.size());

        assertEquals(5, list.get(1));
        assertEquals(1, list.get(2));
        assertEquals(2, list.get(3));
        assertEquals(3, list.get(4));
        assertEquals(4, list.get(5));
    }

    @Test
    void testContains() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        assertTrue(list.contains(4));
        assertFalse(list.contains(5));
    }

    @Test
    void testClear() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testIsEmpty() {
        List<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
    }
}
