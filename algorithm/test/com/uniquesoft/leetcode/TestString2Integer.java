/**
 * 
 */
package com.uniquesoft.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author alicelu
 *
 */
public class TestString2Integer {

    @Test
    public void testString2Integer() {
        assertEquals(0, String2Integer.string2Integer("0"));
        assertEquals(123, String2Integer.string2Integer("+123.456"));
        assertEquals(-987654321, String2Integer.string2Integer("-987654321.123"));
        assertEquals(2147483647, String2Integer.string2Integer("2147483648"));
        assertEquals(15, String2Integer.string2Integer("15"));
        assertEquals(21, String2Integer.string2Integer(" 021 "));
    }

}
