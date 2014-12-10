/**
 * 
 */
package com.uniquesoft.programcreek;

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

    public static List<String> postorderTraverse() {
        List<String> rlt = new ArrayList<String>();
        postorderTraverse(root, rlt);
        rlt.add(root.item);
        return rlt;
    }

    private static void postorderTraverse(Node<String> node, List<String> list) {
        if (node.left != null) {
            postorderTraverse(node.left, list);
            list.add(node.left.item);
        }
        if (node.right != null) {
            postorderTraverse(node.right, list);
            list.add(node.right.item);
        }
    }

    public static List<String> inorderTraverse() {
        return new ArrayList<String>();
    }

}
