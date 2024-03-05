package datastructures.queue;

public interface Queue<T> {

    void enqueue(T o);

    Object dequeue();

    Object peek();

    boolean isEmpty();

    int size();

    void clear();
}
