package datastructures.list;

import exception.EmptyListException;

import java.util.Objects;

public class LinkedList<T> implements List<T> {

    private Node head;

    private Node tail;

    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object data) {
        Node newNode = new Node(data);
        if (Objects.isNull(head)) {
            head = newNode;
            tail = head;
        } else {
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        incrementSize();
    }

    @Override
    public void remove(Object data) {
        if (Objects.isNull(head)) {
            throw new EmptyListException();
        }

        Node current = new Node(Integer.MIN_VALUE);
        current.setNext(head);

        while (Objects.nonNull(current.getNext())) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                decrementSize();
            }
            current = current.getNext();
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    private void incrementSize() {
        size += 1;
    }

    private void decrementSize() {
        size -= 1;
    }
}
