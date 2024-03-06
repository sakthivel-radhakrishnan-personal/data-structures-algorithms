package datastructures.queue;

import datastructures.list.Node;

public class ListImpl<T> implements Queue<T> {

    Node head;

    Node tail;

    int size;

    ListImpl() {
        resetQueue();
    }

    @Override
    public void enqueue(T o) {
        Node newNode = new Node(o);
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
    public Object dequeue() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }

        Node temp = head;
        head = temp.getNext();
        size--;

        return temp.getData();
    }

    @Override
    public Object peek() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }

        return head.getData();
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
        resetQueue();
    }

    private void resetQueue() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
}
