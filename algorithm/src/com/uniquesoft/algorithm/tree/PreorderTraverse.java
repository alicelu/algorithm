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
public class PreorderTraverse {

    private static final List list = new ArrayList();

    public static List preorderSearch(Node node) {
        search(node);
        return list;
    }

    private static void search(Node node) {
        visit(node);
        if (node.left != null) {
            search(node.left);
        }
        if (node.right != null) {
            search(node.right);
        }
    }

    private static void visit(Node node) {
        list.add(node.item);
    }
}
