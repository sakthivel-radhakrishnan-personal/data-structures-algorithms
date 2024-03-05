package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayImplTest {

    private final int QUEUE_SIZE = 100_000;

    @Test
    void testEnqueue() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        assertEquals(QUEUE_SIZE, queue.size());
    }

    @Test
    void testDequeue() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }
    }

    @Test
    void testDequeueUnderflow() {
        Queue<Integer> queue = new ArrayImpl<>();

        assertThrows(RuntimeException.class, queue::dequeue);
    }

    @Test
    void testPeek() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        assertEquals(1, queue.peek());
    }

    @Test
    void testPeekUnderflow() {
        Queue<Integer> queue = new ArrayImpl<>();

        assertThrows(RuntimeException.class, queue::peek);
    }

    @Test
    void testIsEmpty() {
        Queue<Integer> queue = new ArrayImpl<>();

        assertTrue(queue.isEmpty());

        queue.enqueue(1);

        assertFalse(queue.isEmpty());
    }

    @Test
    void testSize() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        assertEquals(QUEUE_SIZE, queue.size());
    }

    @Test
    void testClear() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        queue.clear();

        assertTrue(queue.isEmpty());
    }

    @Test
    void testEnqueueDequeue() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertTrue(queue.isEmpty());
    }

    @Test
    void testEnqueueDequeueEnqueueDequeue() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertTrue(queue.isEmpty());

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertTrue(queue.isEmpty());
    }

    @Test
    void testEnqueueDequeueEnqueueDequeueEnqueueDequeue() {
        Queue<Integer> queue = new ArrayImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertTrue(queue.isEmpty());

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertTrue(queue.isEmpty());

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertTrue(queue.isEmpty());
    }
}
