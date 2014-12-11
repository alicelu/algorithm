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

    public static List preorderTraverse(Node root) {
        list = new ArrayList();
        traverse(root);
        return list;
    }

    private static void traverse(Node node) {
        visit(node);
        if (node.getLeft() != null) {
            traverse(node.getLeft());
        }
        if (node.getRight() != null) {
            traverse(node.getRight());
        }
    }

    private static void visit(Node node) {
        list.add(node.getItem());
    }
}
