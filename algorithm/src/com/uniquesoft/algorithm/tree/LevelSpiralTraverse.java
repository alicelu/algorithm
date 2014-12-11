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
public class LevelSpiralTraverse {

    public static List levelSpiralTraverse(Node root) {
        List list = new ArrayList();

        Stack<Node> curLevel = new Stack<Node>();
        List<Node> nextLevel = new ArrayList<Node>();

        curLevel.push(root);

        boolean left2Right = false;
        while (!curLevel.isEmpty()) {
            Node node = curLevel.pop();
            list.add(node.item);

            if (left2Right) {
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
            } else {
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            if (curLevel.isEmpty()) {
                left2Right = !left2Right;
                for (Node n : nextLevel) {
                    curLevel.push(n);
                }
                nextLevel = new ArrayList<Node>();
            }
        }

        return list;
    }

}
