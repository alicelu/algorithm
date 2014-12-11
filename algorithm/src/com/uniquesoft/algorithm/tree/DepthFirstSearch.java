/**
 * 
 */
package com.uniquesoft.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author alicelu
 *         Quite like Pre-order Traverse, except that the search would stop when the node is found.
 *
 */
public class DepthFirstSearch {

    public static List dfs(Node root) {
        List list = new ArrayList();

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.item);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return list;
    }

}
