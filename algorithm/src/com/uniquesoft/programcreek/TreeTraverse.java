/**
 * 
 */
package com.uniquesoft.programcreek;

import java.util.Stack;

/**
 * @author lusha
 * 
 */
public class TreeTraverse {
    private class Node<E> {
        E item;
        Node<E> left;
        Node<E> right;

        public Node(E i) {
            this.item = i;
        }
    }

    private static Node<String> root;

    public TreeTraverse() {
        root = new Node<String>("A");

        Node<String> nodeB = new Node<String>("B");
        Node<String> nodeC = new Node<String>("C");
        Node<String> nodeD = new Node<String>("D");
        Node<String> nodeE = new Node<String>("E");
        Node<String> nodeF = new Node<String>("F");

        root.left = nodeB;
        root.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeE.right = nodeF;
    }

    public static void main(String[] args) {

    }

    public static void preorderTraverse() {
        Stack<Node<String>> stack = new Stack<Node<String>>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node<String> node = stack.pop();

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

    }
}
