package datastructures.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testRemoveWhenElementIsPresent() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(3));

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
}
