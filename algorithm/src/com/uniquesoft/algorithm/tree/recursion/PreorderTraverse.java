/**
 * 
 */
package com.uniquesoft.algorithm.tree.recursion;

import java.util.ArrayList;
import java.util.List;

import com.uniquesoft.algorithm.tree.Node;

/**
 * @author alicelu
 *
 */
public class PreorderTraverse {

    private static List list = new ArrayList();

    public static List preorderSearch(Node root) {
        list = new ArrayList();
        search(root);
        return list;
    }

    private static void search(Node node) {
        visit(node);
        if (node.getLeft() != null) {
            search(node.getLeft());
        }
        if (node.getRight() != null) {
            search(node.getRight());
        }
    }

    private static void visit(Node node) {
        list.add(node.getItem());
    }
}
