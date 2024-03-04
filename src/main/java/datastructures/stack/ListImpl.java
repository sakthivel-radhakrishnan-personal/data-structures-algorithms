package datastructures.stack;

import datastructures.list.Node;

public class ListImpl<T> implements Stack<T> {

    private Node head;

    private Node tail;

    private int size;

    ListImpl() {
        resetPointers();
        size = 0;
    }

    @Override
    public void push(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }

        Object data;

        if (head == tail) {
            data = head.getData();
            resetPointers();
            size--;
            return data;
        }

        Node temp = head;

        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }

        data = temp.getNext().getData();

        temp.setNext(null);
        tail = temp;
        size--;

        return data;
    }

    @Override
    public Object peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        return tail.getData();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        resetPointers();
        size = 0;
    }

    private void resetPointers() {
        head = null;
        tail = null;
    }
}
