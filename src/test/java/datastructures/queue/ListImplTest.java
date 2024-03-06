package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListImplTest {

    private final int QUEUE_SIZE = 10_000;

    @Test
    void testEnqueue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        assertEquals(QUEUE_SIZE, list.size());
    }

    @Test
    void testDequeue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            assertEquals(i, list.dequeue());
        }
    }

    @Test
    void testDequeueUnderflow() {
        Queue<Integer> list = new ListImpl<>();

        assertThrows(RuntimeException.class, list::dequeue);
        var e = assertThrows(RuntimeException.class, list::dequeue);
        assertEquals("Queue is empty", e.getMessage());
    }

    @Test
    void testPeek() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        assertEquals(1, list.peek());
    }

    @Test
    void testPeekUnderflow() {
        Queue<Integer> list = new ListImpl<>();

        assertThrows(RuntimeException.class, list::peek);
        var e = assertThrows(RuntimeException.class, list::dequeue);
        assertEquals("Queue is empty", e.getMessage());
    }

    @Test
    void testIsEmpty() {
        Queue<Integer> list = new ListImpl<>();

        assertTrue(list.isEmpty());
    }

    @Test
    void testClear() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test
    void testSize() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        assertEquals(QUEUE_SIZE, list.size());
    }

    @Test
    void testSizeAfterDequeue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        list.dequeue();

        assertEquals(QUEUE_SIZE - 1, list.size());
    }

    @Test
    void testSizeAfterClear() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    void testSizeAfterEnqueueDequeue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        assertEquals(0, list.size());
    }

    @Test
    void testSizeAfterEnqueueDequeueEnqueueDequeue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        assertEquals(0, list.size());
    }

    @Test
    void testSizeAfterEnqueueDequeueEnqueueDequeueEnqueue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        assertEquals(QUEUE_SIZE, list.size());
    }

    @Test
    void testSizeAfterEnqueueDequeueEnqueueDequeueEnqueueDequeue() {
        Queue<Integer> list = new ListImpl<>();

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.enqueue(i);
        }

        for (int i = 1; i <= QUEUE_SIZE; i++) {
            list.dequeue();
        }

        assertEquals(0, list.size());
    }
}
