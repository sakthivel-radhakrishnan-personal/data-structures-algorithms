package datastructures.stack;

public class ArrayImpl<T> implements Stack<T> {

    private Object[] stack;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    ArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    ArrayImpl(int initialCapacity) {
        this.stack = new Object[initialCapacity];
        this.size = -1;
    }

    @Override
    public void push(T element) {
        if (size == stack.length - 1) {
            resize();
        }
        stack[++size] = element;
    }

    @Override
    public Object pop() {
        if (size < 0) {
            throw new RuntimeException("Stack is empty");
        }
        if (size < stack.length / 4) {
            shrink();
        }
        return stack[size--];
    }

    @Override
    public Object peek() {
        if (size < 0) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[size];
    }

    @Override
    public boolean isEmpty() {
        return size < 0;
    }

    @Override
    public int size() {
        return size + 1;
    }

    @Override
    public void clear() {
        stack = new Object[DEFAULT_CAPACITY];
        size = -1;
    }

    private void resize() {
        Object[] newStack = new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    private void shrink() {
        Object[] newStack = new Object[stack.length / 2];
        System.arraycopy(stack, 0, newStack, 0, size + 1);
        stack = newStack;
    }
}
