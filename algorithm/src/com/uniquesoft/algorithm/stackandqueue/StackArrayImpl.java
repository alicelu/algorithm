/**
 * 
 */
package com.uniquesoft.algorithm.stackandqueue;

/**
 * @author lusha
 * 
 */
public class StackArrayImpl<E> {
    private Object[] items;
    private int size;

    public StackArrayImpl(int size) {
        items = new Object[size];
        size = 0;
    }

    public void push(E item) {
        if (items.length <= size) {
            
        } else {
            
        }
        items[size++] = item;
    }

    public void pop() {

    }
    
    private void resizeArray(Object[] items) {
        
    }
}
