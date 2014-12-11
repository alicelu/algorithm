/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.assertEquals;

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

    private Node<String> root1;
    private Node<String> root2;

    public TreeTraverseTest() {
        root1 = new Node<String>("A");

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

        root1.setLeft(nodeB);
        root1.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeC.setLeft(nodeF);
        nodeC.setRight(nodeG);
        nodeD.setLeft(nodeH);
        nodeD.setRight(nodeI);
        nodeE.setRight(nodeJ);
        nodeG.setLeft(nodeK);

        root2 = new Node<String>("A");

        Node<String> nodeB2 = new Node<String>("B");
        Node<String> nodeC2 = new Node<String>("C");
        Node<String> nodeD2 = new Node<String>("D");
        Node<String> nodeE2 = new Node<String>("E");
        root2.setRight(nodeB2);
        nodeB2.setLeft(nodeC2);
        nodeC2.setRight(nodeD2);
        nodeD2.setRight(nodeE2);
    }

    @Test
    public void testPreorderSearch() {
        assertEquals("A B D H I E J C F G K", TestUtils.buildStringFromList(PreorderTraverse.preorderSearch(root1)));
        assertEquals("A B C D E", TestUtils.buildStringFromList(PreorderTraverse.preorderSearch(root2)));
    }

    @Test
    public void testPostorderTraverse() {
        assertEquals("H I D J E B F K G C A", TestUtils.buildStringFromList(PostorderTraverse.postorderSearch(root1)));
        assertEquals("E D C B A", TestUtils.buildStringFromList(PostorderTraverse.postorderSearch(root2)));
    }

    @Test
    public void testInorderTraverse() {
        assertEquals("H D I B E J A F C K G", TestUtils.buildStringFromList(InorderTraverse.inorderSearch(root1)));
        assertEquals("A C D E B", TestUtils.buildStringFromList(InorderTraverse.inorderSearch(root2)));
    }

    @Test
    public void testLevelTraverse() {
        assertEquals("A B C D E F G H I J K", TestUtils.buildStringFromList(LevelTraverse.levelTraverse(root1)));
        assertEquals("A B C D E", TestUtils.buildStringFromList(LevelTraverse.levelTraverse(root2)));
    }

    @Test
    public void testLevelSpiralTraverse() {
        assertEquals("A C B D E F G K J I H",
                TestUtils.buildStringFromList(LevelSpiralTraverse.levelSpiralTraverse(root1)));
        assertEquals("A B C D E", TestUtils.buildStringFromList(LevelSpiralTraverse.levelSpiralTraverse(root2)));
    }
}
