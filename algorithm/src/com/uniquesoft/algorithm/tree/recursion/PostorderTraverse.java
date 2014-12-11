/**
 * 
 */
package com.uniquesoft.algorithm.tree.recursion;

import java.util.ArrayList;
import java.util.List;

import com.uniquesoft.algorithm.tree.Node;

/**
 * @author alicelu
 *         It's not suggested to use recursion to traverse the tree, since we don't know the depth
 *         of the tree or the branch distribution.
 *         Recursion could cause stack overflow.
 */
public class PostorderTraverse {

    private static List list = new ArrayList();

    public static List postorderTraverse(Node root) {
        list = new ArrayList();
        traverse(root);
        return list;
    }

    private static void traverse(Node node) {
        if (node.getLeft() != null) {
            traverse(node.getLeft());
        }
        if (node.getRight() != null) {
            traverse(node.getRight());
        }
        visit(node);
    }

    private static void visit(Node node) {
        list.add(node.getItem());
    }
}
