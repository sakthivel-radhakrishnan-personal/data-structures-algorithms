package datastructures.list;

import exception.EmptyListException;

public interface List<T> {
    int size();

    void add(T data);

    void remove(T element) throws EmptyListException;

    void remove(int index);

    void add(int index, T element);

    Object get(int index);

    boolean contains(T o);
}
