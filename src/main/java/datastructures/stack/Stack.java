package datastructures.stack;

public interface Stack<T> {

    void push(T element);

    Object pop();

    Object peek();

    boolean isEmpty();

    int size();

    void clear();
}
