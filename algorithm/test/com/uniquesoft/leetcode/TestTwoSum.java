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
public class TestTwoSum {

    @Test
    public void testTwoSum() {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;

        int[] result = TwoSum.twoSum(numbers, target);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }
}
