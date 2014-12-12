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
public class TestRegExMatch {

    @Test
    public void testRegExMatch() {
        assertEquals(false, RegExMatch.isMatch("aa", "a"));
        assertEquals(true, RegExMatch.isMatch("aa", "aa"));
        assertEquals(false, RegExMatch.isMatch("aaa", "aa"));
        assertEquals(true, RegExMatch.isMatch("aa", "a*"));
        assertEquals(true, RegExMatch.isMatch("aa", ".*"));
        assertEquals(true, RegExMatch.isMatch("ab", ".*"));
        assertEquals(true, RegExMatch.isMatch("aab", "c*a*b"));
    }
}
