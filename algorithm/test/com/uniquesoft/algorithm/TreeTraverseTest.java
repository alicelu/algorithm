/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.uniquesoft.algorithm.tree.LevelSpiralTraverse;
import com.uniquesoft.algorithm.tree.LevelTraverse;
import com.uniquesoft.algorithm.tree.Node;
import com.uniquesoft.algorithm.tree.recursion.InorderTraverse;
import com.uniquesoft.algorithm.tree.recursion.PostorderTraverse;
import com.uniquesoft.algorithm.tree.recursion.PreorderTraverse;
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
        Node<String> nodeG = new Node<String>("G");
        Node<String> nodeH = new Node<String>("H");
        Node<String> nodeI = new Node<String>("I");
        Node<String> nodeJ = new Node<String>("J");
        Node<String> nodeK = new Node<String>("K");

        root.setLeft(nodeB);
        root.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeC.setLeft(nodeF);
        nodeC.setRight(nodeG);
        nodeD.setLeft(nodeH);
        nodeD.setRight(nodeI);
        nodeE.setRight(nodeJ);
        nodeG.setLeft(nodeK);
    }

    @Test
    public void testPreorderSearch() {
        List result = PreorderTraverse.preorderSearch(root);
        assertEquals("A B D H I E J C F G K", TestUtils.buildStringFromList(result));
    }

    @Test
    public void testPostorderTraverse() {
        List result = PostorderTraverse.postorderSearch(root);
        assertEquals("H I D J E B F K G C A", TestUtils.buildStringFromList(result));
    }

    @Test
    public void testInorderTraverse() {
        List result = InorderTraverse.inorderSearch(root);
        assertEquals("H D I B E J A F C K G", TestUtils.buildStringFromList(result));
    }

    @Test
    public void testLevelTraverse() {
        List result = LevelTraverse.levelTraverse(root);
        assertEquals("A B C D E F G H I J K", TestUtils.buildStringFromList(result));
    }

    @Test
    public void testLevelSpiralTraverse() {
        List result = LevelSpiralTraverse.levelSpiralTraverse(root);
        assertEquals("A C B D E F G K J I H", TestUtils.buildStringFromList(result));
    }
}
