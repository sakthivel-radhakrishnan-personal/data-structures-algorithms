package datastructures.list;

import exception.EmptyListException;

public interface List<T> {

    void add(T data);

    void add(int index, T element);

    void remove(int index);

    void remove(T element) throws EmptyListException;

    Object get(int index);

    boolean contains(T o);

    int size();

    boolean isEmpty();

    void clear();
}
