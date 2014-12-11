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

    private static final List list = new ArrayList();

    public static List postorderSearch(Node node) {
        search(node);
        return list;
    }

    private static void search(Node node) {
        if (node.getLeft() != null) {
            search(node.getLeft());
        }
        if (node.getRight() != null) {
            search(node.getRight());
        }
        visit(node);
    }

    private static void visit(Node node) {
        list.add(node.getItem());
    }
}
