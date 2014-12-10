/**
 * 
 */
package com.uniquesoft.programcreek;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * @author alicelu
 *
 */
public class TreeTraverseTest {

    private String buildStringFromList(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s + " ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Test
    public void testPreoderTraverse() {
        List<String> rlt = TreeTraverse.preorderTraverse();
        assertEquals("A B D E F C", buildStringFromList(rlt));
    }

    @Test
    public void testPostorderTraverse() {
        List<String> rlt = TreeTraverse.postorderTraverse();
        assertEquals("D F E B C A", buildStringFromList(rlt));
    }

    @Test
    public void testInorderTraverse() {
        List<String> rlt = TreeTraverse.inorderTraverse();
        assertEquals("D B E F A C", buildStringFromList(rlt));
    }
}
