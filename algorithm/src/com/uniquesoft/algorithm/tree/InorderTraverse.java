/**
 * 
 */
package com.uniquesoft.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alicelu
 *
 */
public class InorderTraverse<E> {

    private static final List list = new ArrayList();

    public static List inorderSearch(Node node) {
        search(node);
        return list;
    }

    private static void search(Node node) {
        if (node.left != null) {
            search(node.left);
        }
        visit(node);
        if (node.right != null) {
            search(node.right);
        }
    }

    private static void visit(Node node) {
        list.add(node.item);
    }
}
