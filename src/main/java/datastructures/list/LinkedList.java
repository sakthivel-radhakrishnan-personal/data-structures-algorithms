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
    public void add(int index, Object element) {
        Node newNode = new Node(element);
        if (Objects.isNull(head)) {
            head = newNode;
            tail = head;
        } else {
            if (index <= 0) {
                newNode.setNext(head);
                head = newNode;
            } else if (index > size) {
                tail.setNext(newNode);
                tail = newNode;
            } else {
                Node temp = new Node(Integer.MIN_VALUE);
                temp.setNext(head);
                Node current = temp;
                while (temp != null && --index > 0) {
                    temp = temp.getNext();
                }
                if (temp != null) {
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                }
                head = current.getNext();
            }
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
        Node temp = current;

        while (Objects.nonNull(current) && Objects.nonNull(current.getNext())) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                decrementSize();
            }
            current = current.getNext();
        }
        head = temp.getNext();
    }

    @Override
    public void remove(int position) throws EmptyListException {
        if (head == null) {
            throw new EmptyListException();
        }

        if (position <= 0 || position > size) {
            throw new RuntimeException("Incorrect input position");
        }

        Node current = new Node(Integer.MIN_VALUE);
        current.setNext(head);
        Node temp = current;

        while (Objects.nonNull(current) && --position > 0) {
            current = current.getNext();
        }

        if (Objects.nonNull(current) && Objects.nonNull(current.getNext())) {
            current.setNext(current.getNext().getNext());
            decrementSize();
        }

        head = temp.getNext();
    }

    @Override
    public Object get(int index) {
        if (head == null) {
            throw new EmptyListException();
        }

        if (index <= 0 || index > size) {
            throw new RuntimeException("Incorrect input position");
        }

        Node current = new Node(Integer.MIN_VALUE);
        current.setNext(head);

        while (Objects.nonNull(current) && --index > 0) {
            current = current.getNext();
        }

        if (Objects.nonNull(current) && Objects.nonNull(current.getNext())) {
            return current.getNext().getData();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.getData() == o) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    private void incrementSize() {
        size += 1;
    }

    private void decrementSize() {
        size -= 1;
    }
}
