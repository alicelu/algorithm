/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uniquesoft.algorithm.stackandqueue.StackArrayImpl;
import com.uniquesoft.algorithm.stackandqueue.StackListImpl;

/**
 * @author alicelu
 * 
 */
public class StackTest {

    @Test
    public void testStackListImpl() {
        StackListImpl<String> stack = new StackListImpl<String>();
        stack.push("Alice");
        stack.push("Test");
        assertEquals("Test", stack.pop());
    }

    @Test
    public void testStackArrayImpl() {
        StackArrayImpl<String> stack = new StackArrayImpl<String>();
        stack.push("Alice");
        stack.push("Test");
        stack.push("Stack");
        stack.push("Implementation");
        stack.push("with");
        stack.push("Array");
        stack.push("Hello");
        stack.push("World");
        stack.push("Algorithm");
        stack.push("Programming");
        assertEquals("Programming", stack.pop());
        stack.push("Creek");
        stack.push("Geek");
        assertEquals("Geek", stack.pop());
        assertEquals("Creek", stack.pop());
        assertEquals("Algorithm", stack.pop());
    }

}
