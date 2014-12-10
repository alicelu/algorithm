/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.uniquesoft.algorithm.tree.InorderTraverse;
import com.uniquesoft.algorithm.tree.Node;
import com.uniquesoft.algorithm.tree.PostorderTraverse;
import com.uniquesoft.algorithm.tree.PreorderTraverse;
import com.uniquesoft.util.TestUtils;

/**
 * @author alicelu
 *
 */
public class TreeTraverseTest {

    private Node<String> root;

    public TreeTraverseTest() {
        root = new Node<String>("A");

        Node<String> nodeB = new Node<String>("B");
        Node<String> nodeC = new Node<String>("C");
        Node<String> nodeD = new Node<String>("D");
        Node<String> nodeE = new Node<String>("E");
        Node<String> nodeF = new Node<String>("F");

        root.setLeft(nodeB);
        root.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeE.setRight(nodeF);
    }

    @Test
    public void testPreorderSearch() {
        List result = PreorderTraverse.preorderSearch(root);
        assertEquals("A B D E F C", TestUtils.buildStringFromList(result));
    }

    @Test
    public void testPostorderTraverse() {
        List result = PostorderTraverse.postorderSearch(root);
        assertEquals("D F E B C A", TestUtils.buildStringFromList(result));
    }

    @Test
    public void testInorderTraverse() {
        List result = InorderTraverse.inorderSearch(root);
        assertEquals("D B E F A C", TestUtils.buildStringFromList(result));
    }

}
