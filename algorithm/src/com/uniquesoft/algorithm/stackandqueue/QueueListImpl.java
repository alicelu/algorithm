/**
 * 
 */
package com.uniquesoft.algorithm.stackandqueue;

/**
 * @author lusha
 * 
 */
public class QueueListImpl<E> {
    private class Node<E> {
        E item;
        Node<E> next;

        public Node(E value) {
            item = value;
            next = null;
        }
    }

    private Node<E> first;
    private Node<E> last;

    public void enqueue(E item) {
        Node<E> newNode = new Node(item);
        last.next = newNode;
        // TODO Special case for empty queue
        last = newNode;
    }

    public E dequeue() {
        E item = first.item;
        first = first.next;
        // TODO Special case for empty queue
        return item;
    }

    public boolean isEmpty() {
        return (first == null) && (last == null);
    }

}
