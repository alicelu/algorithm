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
public class LevelSpiralTraverse {

    private static final List list = new ArrayList();

    private static boolean reverse = true;

    public static List levelSpiralTraverse(Node node) {
        if (node != null) {
            list.add(node.item);
            traverse(node);
        }
        return list;
    }

    private static void traverse(Node node) {
        if (node != null) {
            Node left = node.left;
            Node right = node.right;
            if (reverse) {
                if (right != null) {
                    list.add(right.item);
                }
                if (left != null) {
                    list.add(left.item);
                }
                traverse(right);
                traverse(left);
            } else {
                if (left != null) {
                    list.add(left.item);
                }
                if (right != null) {
                    list.add(right.item);
                }
                traverse(left);
                traverse(right);
            }
            reverse = !reverse;
        }
    }

}
