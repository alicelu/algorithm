/**
 * 
 */
package com.uniquesoft.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author alicelu
 *         Quite like Level Traverse. Use Queue to implement the function.
 *
 */
public class BreadthFirstSearch {

    public static List bfs(Node root) {
        List list = new ArrayList();

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
