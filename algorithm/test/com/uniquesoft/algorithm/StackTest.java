/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author alicelu
 *
 */
public class StackTest {

    @Test
    public void testPush() {
        StackImpl<String> stack = new StackImpl<String>();
        stack.push("Alice");
        stack.push("Test");
        assertEquals("Test", stack.pop());
    }

}
