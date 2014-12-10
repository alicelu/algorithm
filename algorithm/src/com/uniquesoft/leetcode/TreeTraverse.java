/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lusha
 * 
 */
public class TreeTraverse {
    private static class Node<E> {
        E item;
        Node<E> left;
        Node<E> right;

        public Node(E i) {
            this.item = i;
        }
    }

    private static Node<String> root;

    static {
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

    public static List<String> preorderTraverse() {
        List<String> rlt = new ArrayList<String>();

        Stack<Node<String>> stack = new Stack<Node<String>>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node<String> node = stack.pop();
            rlt.add(node.item);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return rlt;
    }

    public static List<String> inorderTraverse() {
        List<String> rlt = new ArrayList<String>();

        Stack<Node<String>> stack = new Stack<Node<String>>();

        Node<String> node = root;
        while (!stack.isEmpty() || (node != null)) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                rlt.add(node.item);
                node = node.right;
            }
        }

        return rlt;
    }

    public static List<String> postorderTraverse() {
        List<String> rlt = new ArrayList<String>();

        Stack<Node<String>> stack = new Stack<Node<String>>();
        stack.push(root);

        Node<String> prev = null;
        while (!stack.isEmpty()) {
            Node<String> curr = stack.peek();

            // go down the tree.
            // check if current node is leaf, if so, process it and pop stack,
            // otherwise, keep going down
            if ((prev == null) || (prev.left == curr) || (prev.right == curr)) {
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                } else {
                    stack.pop();
                    rlt.add(curr.item);
                }
                // go up the tree from left node
                // need to check if there is a right child
                // if yes, push it to stack
                // otherwise, process parent and pop stack
            } else if (curr.left == prev) {
                if (curr.right != null) {
                    stack.push(curr.right);
                } else {
                    stack.pop();
                    rlt.add(curr.item);
                }
                // go up the tree from right node
                // after coming back from right node, process parent node and pop stack.
            } else if (curr.right == prev) {
                stack.pop();
                rlt.add(curr.item);
            }
            prev = curr;
        }

        return rlt;
    }

}
