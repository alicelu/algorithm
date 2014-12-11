/**
 * 
 */
package com.uniquesoft.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author alicelu
 *
 */
public class LevelTraverse {

    private static List list = new ArrayList();

    public static List levelTraverse(Node root) {
        list = new ArrayList();

        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            list.add(node.item);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return list;
    }

}
