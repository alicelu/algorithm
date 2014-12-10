/**
 * 
 */
package com.uniquesoft.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.uniquesoft.util.TestUtils;

/**
 * @author alicelu
 *
 */
public class TreeTraverseTest {

    @Test
    public void testPreoderTraverse() {
        List<String> rlt = TreeTraverse.preorderTraverse();
        assertEquals("A B D E F C", TestUtils.buildStringFromList(rlt));
    }

    @Test
    public void testPostorderTraverse() {
        List<String> rlt = TreeTraverse.postorderTraverse();
        assertEquals("D F E B C A", TestUtils.buildStringFromList(rlt));
    }

    @Test
    public void testInorderTraverse() {
        List<String> rlt = TreeTraverse.inorderTraverse();
        assertEquals("D B E F A C", TestUtils.buildStringFromList(rlt));
    }
}
