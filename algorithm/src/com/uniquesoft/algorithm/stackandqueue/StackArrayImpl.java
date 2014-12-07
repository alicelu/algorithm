/**
 * 
 */
package com.uniquesoft.algorithm.stackandqueue;

/**
 * @author lusha
 * 
 */
public class StackArrayImpl<E> {
    private static final int DEFAULT_ARRAY_SIZE = 10;

    private Object[] items;
    private int size;

    public StackArrayImpl() {
        items = new Object[DEFAULT_ARRAY_SIZE];
    }

    public StackArrayImpl(int capacity) {
        this.items = new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E item) {
        if (items.length == size) {
            resizeArray(size * 2);
        }
        items[size++] = item;
    }

    public E pop() {
        if (size > 0) {
            if (size <= items.length / 4) {
                resizeArray(items.length / 2);
            }
            return (E) items[--size];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * TODO Note: capacity as parameter
     */
    private void resizeArray(int capacity) {
        Object[] newArr = new Object[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            newArr[i] = items[i];
        }
        items = newArr;
    }
}
