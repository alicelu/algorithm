/**
 * 
 */
package com.uniquesoft.algorithm.tree;

/**
 * @author alicelu
 *
 */
public class Node<E> {
    E item;
    Node<E> left;
    Node<E> right;

    public Node(E i) {
        this.item = i;
    }

    /**
     * @return the item
     */
    public E getItem() {
        return item;
    }

    /**
     * @param item
     *            the item to set
     */
    public void setItem(E item) {
        this.item = item;
    }

    /**
     * @return the left
     */
    public Node<E> getLeft() {
        return left;
    }

    /**
     * @param left
     *            the left to set
     */
    public void setLeft(Node<E> left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public Node<E> getRight() {
        return right;
    }

    /**
     * @param right
     *            the right to set
     */
    public void setRight(Node<E> right) {
        this.right = right;
    }

}
