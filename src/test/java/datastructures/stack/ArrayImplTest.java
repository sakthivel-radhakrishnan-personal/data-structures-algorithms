package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayImplTest {

    private final int STACK_SIZE = 10_00000;

    @Test
    void testPush() {
        Stack<Integer> stack = new ArrayImpl<>();

        for (int i = 1; i <= STACK_SIZE; i++) {
            stack.push(i);
        }

        assertEquals(STACK_SIZE, stack.size());
    }

    @Test
    void testPop() {
        Stack<Integer> stack = new ArrayImpl<>();

        for (int i = 1; i <= STACK_SIZE; i++) {
            stack.push(i);
        }

        for (int i = STACK_SIZE; i > 0; i--) {
            assertEquals(i, stack.pop());
        }
    }

    @Test
    void testStackUnderflow() {
        Stack<Integer> stack = new ArrayImpl<>();

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());

        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    void testStackUnderflowWithEmptyStack() {
        Stack<Integer> stack = new ArrayImpl<>();

        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = new ArrayImpl<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(5, stack.peek());
        assertEquals(5, stack.size());
    }

    @Test
    void testPeekWithEmptyStack() {
        Stack<Integer> stack = new ArrayImpl<>();

        assertThrows(RuntimeException.class, stack::peek);
    }

    @Test
    void testIsEmpty() {
        Stack<Integer> stack = new ArrayImpl<>();

        assertTrue(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertFalse(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testSize() {
        Stack<Integer> stack = new ArrayImpl<>();

        assertEquals(0, stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertEquals(5, stack.size());
    }
}
