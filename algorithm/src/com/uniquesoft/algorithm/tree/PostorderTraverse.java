/**
 * 
 */
package com.uniquesoft.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author alicelu
 *
 */
public class PostorderTraverse<E> {

    private static final List list = new ArrayList();

    public static List postorderSearch(Node node) {
        search(node);
        return list;
    }

    private static void search(Node node) {
        if (node.left != null) {
            search(node.left);
        }
        if (node.right != null) {
            search(node.right);
        }
        visit(node);
    }

    private static void visit(Node node) {
        list.add(node.item);
    }
}
