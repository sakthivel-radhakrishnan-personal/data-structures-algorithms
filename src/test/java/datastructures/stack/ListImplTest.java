package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListImplTest {

    private final int STACK_SIZE = 10_000;

    @Test
    void testPush() {
        Stack<Integer> stack = new ListImpl<>();

        for (int i = 1; i <= STACK_SIZE; i++) {
            stack.push(i);
        }

        assertEquals(STACK_SIZE, stack.size());
    }

    @Test
    void testPop() {
        ListImpl<Integer> list = new ListImpl<>();

        for (int i = 1; i <= STACK_SIZE; i++) {
            list.push(i);
        }

        for (int i = STACK_SIZE; i > 0; i--) {
            assertEquals(i, list.pop());
        }
    }

    @Test
    void testStackUnderflow() {
        ListImpl<Integer> list = new ListImpl<>();

        list.push(1);
        list.push(2);

        assertEquals(2, list.pop());
        assertEquals(1, list.pop());

        assertThrows(RuntimeException.class, list::pop);
    }

    @Test
    void testStackUnderflowWithEmptyStack() {
        ListImpl<Integer> list = new ListImpl<>();

        assertThrows(RuntimeException.class, list::pop);
    }

    @Test
    void testPeek() {
        ListImpl<Integer> list = new ListImpl<>();

        list.push(1);
        list.push(2);

        assertEquals(2, list.peek());
        assertEquals(2, list.peek());
    }

    @Test
    void testPeekWithEmptyStack() {
        ListImpl<Integer> list = new ListImpl<>();
        assertThrows(RuntimeException.class, list::peek);
    }

    @Test
    void testIsEmpty() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        list.push(1);
        assertFalse(list.isEmpty());
    }

    @Test
    void testSize() {
        ListImpl<Integer> list = new ListImpl<>();
        assertEquals(0, list.size());
        list.push(1);
        assertEquals(1, list.size());
        list.push(2);
        assertEquals(2, list.size());
        list.pop();
        assertEquals(1, list.size());
    }

    @Test
    void testClear() {
        ListImpl<Integer> list = new ListImpl<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testClearWithEmptyStack() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testClearWithPop() {
        ListImpl<Integer> list = new ListImpl<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertFalse(list.isEmpty());
        list.pop();
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testClearWithPeek() {
        ListImpl<Integer> list = new ListImpl<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertFalse(list.isEmpty());
        list.peek();
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testClearWithPush() {
        ListImpl<Integer> list = new ListImpl<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertFalse(list.isEmpty());
        list.push(6);
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testClearWithSize() {
        ListImpl<Integer> list = new ListImpl<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertFalse(list.isEmpty());
        assertEquals(5, list.size());
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testClearWithMultipleOperations() {
        ListImpl<Integer> list = new ListImpl<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        assertFalse(list.isEmpty());
        assertEquals(5, list.size());
        list.pop();
        list.peek();
        list.push(6);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testClearWithMultipleOperationsAndEmptyStack() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertThrows(RuntimeException.class, list::pop);
        assertThrows(RuntimeException.class, list::peek);
        list.push(6);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testClearWithMultipleOperationsAndEmptyStackAndPush() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertThrows(RuntimeException.class, list::pop);
        assertThrows(RuntimeException.class, list::peek);
        list.push(6);
        list.push(7);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testClearWithMultipleOperationsAndEmptyStackAndPushAndPop() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertThrows(RuntimeException.class, list::pop);
        assertThrows(RuntimeException.class, list::peek);
        list.push(6);
        list.push(7);
        list.pop();
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testClearWithMultipleOperationsAndEmptyStackAndPushAndPopAndPeek() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertThrows(RuntimeException.class, list::pop);
        assertThrows(RuntimeException.class, list::peek);
        list.push(6);
        list.push(7);
        list.pop();
        list.peek();
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testClearWithMultipleOperationsAndEmptyStackAndPushAndPopAndPeekAndPush() {
        ListImpl<Integer> list = new ListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertThrows(RuntimeException.class, list::pop);
        assertThrows(RuntimeException.class, list::peek);
        list.push(6);
        list.push(7);
        list.pop();
        list.peek();
        list.push(8);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }
}
