/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.uniquesoft.algorithm.stackandqueue.StackListImpl;

/**
 * @author alicelu
 *
 */
public class StackTest {

    @Test
    public void testPush() {
        StackListImpl<String> stack = new StackListImpl<String>();
        stack.push("Alice");
        stack.push("Test");
        assertEquals("Test", stack.pop());
    }

}
