/**
 * 
 */
package com.uniquesoft.algorithm;

/**
 * @author alicelu
 *
 */
public class StackImpl<E> {

    private class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<E> top;

    public void push(E value) {
        Node<E> newNode = new Node<E>(value);
        newNode.next = top;
        top = newNode;
    }

    public E pop() {
        if (top != null) {
            E value = top.value;
            top = top.next;
            return value;
        } else {
            return null;
        }
    }

}
