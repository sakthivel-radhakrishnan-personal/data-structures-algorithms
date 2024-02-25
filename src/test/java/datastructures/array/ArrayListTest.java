package datastructures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void testAdd() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
        assertEquals(10_000_000, list.size());

        for (int i = 0; i < 10_000_000; i++) {
            assertEquals(i, list.get(i));
        }
    }

//    @Test
//    void testRemove() {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10_000_000; i++) {
//            list.add(i);
//        }
//        list.remove(0);
//        assertEquals(9_999_999, list.size());
//    }

    @Test
    void testAddAtIndex() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
        list.add(100, 1234);
        assertEquals(1234, list.get(100));

        list.add(0, 5678);
        assertEquals(5678, list.get(0));

        list.add(9_99_999, 9999);
        assertEquals(9999, list.get(9_99_999));
    }

    @Test
    void testAddAtIndexOutOfBounds() {
        ArrayList<Integer> list = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add(-1, 1234));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add(10_000_000, 9999));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add(10_000_001, 1234));
    }

    @Test
    void testRemoveFromIndex() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
        assertNotNull(list.get(0));
        assertEquals(10_000_000, list.size());
        list.remove(0);
        assertNull(list.get(0));
        assertEquals(9_999_999, list.size());

        assertNotNull(list.get(9_999_998));
        list.remove(9_999_998);
        assertNull(list.get(9_999_998));
        assertEquals(9_999_998, list.size());
    }

    @Test
    void testRemoveFromIndexOutOfBounds() {
        ArrayList<Integer> list = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(10_000_000));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(10_000_001));
    }

    @Test
    void testGet() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
        assertEquals(0, list.get(0));
        assertEquals(999_999, list.get(999_999));
        assertEquals(9_999_999, list.get(9_999_999));
    }

    @Test
    void testContains() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        assertTrue(list.contains(0));
        assertTrue(list.contains(99));
        assertTrue(list.contains(999));
        assertTrue(list.contains(9_99_999));
        assertFalse(list.contains(10_000_000));
    }

    @Test
    void testClear() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        assertEquals(10_000_000, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testGetOutOfBounds() {
        ArrayList<Integer> list = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(10_000_000));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(10_000_001));
    }

    @Test
    void testIncreaseCapacity() {
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());

        for (int i = 10; i < 10_00_000; i++) {
            list.add(i);
        }
        assertEquals(10_00_000, list.size());
    }

    @Test
    void testSize() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
        assertEquals(10_000_000, list.size());
    }

    @Test
    void testIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }
}
