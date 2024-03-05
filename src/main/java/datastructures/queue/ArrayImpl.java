package datastructures.queue;

public class ArrayImpl<T> implements Queue<T> {

    private static final int INITIAL_CAPACITY = 10;

    private Object[] queue;

    private int size;

    private int front;

    private int rear;

    ArrayImpl() {
        this(INITIAL_CAPACITY);
    }

    ArrayImpl(int initialCapacity) {
        this.queue = new Object[initialCapacity];
        resetQueue();
    }

    @Override
    public void enqueue(Object o) {
        if (isQueueReachedCapacity()) {
            increaseQueueCapacity();
        }
        queue[rear++] = o;
        size++;
    }

    @Override
    public Object dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }

        if (canReduceQueueSize()) {
            reduceQueueCapacity();
        }
        size--;
        return queue[front++];
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        queue = new Object[INITIAL_CAPACITY];
        resetQueue();
    }

    private void resetQueue() {
        size = 0;
        front = 0;
        rear = 0;
    }

    private boolean isQueueReachedCapacity() {
        return rear == queue.length - 1;
    }

    private boolean canReduceQueueSize() {
        return size < (queue.length >> 1); // Size is less than half of the queue length
    }

    private void increaseQueueCapacity() {
        int newQueueLength = queue.length << 1; // Left shift operator (Multiply queue length by 2)
        Object[] newQueue = new Object[newQueueLength];
        int j = 0;

        // Copy the elements from the existing queue to the newQueue
        for (int i = front; i <= rear; i++) {
            newQueue[j++] = queue[i];
        }

        queue = newQueue;
        front = 0;
        rear = j - 1;
    }

    private void reduceQueueCapacity() {
        int newQueueLength = queue.length >> 1; // Right shift operator (Divide queue length by 2)
        Object[] newQueue = new Object[newQueueLength];

        int j = 0;

        // Copy the elements from the existing queue to the newQueue
        for (int i = front; i <= rear; i++) {
            newQueue[j++] = queue[i];
        }

        queue = newQueue;
        front = 0;
        rear = j - 1;
    }
}
