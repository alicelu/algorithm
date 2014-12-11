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
public class LevelTraverse {

    private static final List list = new ArrayList();

    private static final Stack<Node> stack = new Stack<Node>();

    public static List levelTraverse(Node node) {
        stack.push(node);
        
        while (!stack.isEmpty()) {
            Node left = stack.pop();
            Node right = stack.pop();
            
            if (right.right!= null) {
                stack.push(right.right);
            }
            if (left.left != null) {
                stack.push(left.left);
            }
            
            if (left.left != null) {
                stack.push(left.left);
            }
            
            if (left.left != null) {
                stack.push(left.left);
            }
        }
        
        if (node != null) {
            list.add(node.item);
            traverse(node);
        }
        return list;
    }

    private static void traverse(Node node) {
    }

}
