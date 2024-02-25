package datastructures.array;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList<T> {
    private Object[] list;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    private static final String INDEX_OUT_OF_RANGE_ERR_MSG = "Index range is invalid";

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        list = new Object[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        if (list.length == size) {
            increaseListCapacity();
        }
        list[size++] = element;
    }

    /*
        Removes the first occurrence of the
        specified element from this list,
        if it is present
     */
    public void remove(Object element) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == element) {
                list[i] = null;
                decrementListSize();
                return;
            }
        }
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        validateIndexRange(index);
        list[index] = null;
        decrementListSize();
    }

    public void add(int index, T element) throws ArrayIndexOutOfBoundsException {
        validateIndexRange(index);
        list[index] = element;
    }

    public Object get(int index) throws ArrayIndexOutOfBoundsException {
        validateIndexRange(index);
        return list[index];
    }

    public boolean contains(Object o) {
        for (Object object : list) {
            if (Objects.equals(o, object)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void increaseListCapacity() {
        int oldCapacity = list.length;
        /*
         Left shift by 1. Which will double the array capacity.
         Left shift will multiply the number with 2^n
         Here n = 1 and size = array length
         Hence it will do size * 2^1
         */
        int newCapacity = oldCapacity << 1;
        list = Arrays.copyOf(list, newCapacity);
    }

    private void decrementListSize() {
        size -= 1;
    }

    private void validateIndexRange(int index) {
        if (index < 0 || index >= list.length) {
            throw new ArrayIndexOutOfBoundsException(INDEX_OUT_OF_RANGE_ERR_MSG);
        }
    }

    public void clear() {
        list = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
