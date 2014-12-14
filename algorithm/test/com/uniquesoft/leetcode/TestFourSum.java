/**
 * 
 */
package com.uniquesoft.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author alicelu
 *
 */
public class TestFourSum {

    @Test
    public void testFourSum() {
        int[] numbers = new int[] { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        ArrayList<ArrayList<Integer>> result = FourSum.fourSum(numbers, target);

        ArrayList<Integer> result1 = result.get(0);
        assertEquals(-2, (int) result1.get(0));
        assertEquals(-1, (int) result1.get(1));
        assertEquals(1, (int) result1.get(2));
        assertEquals(2, (int) result1.get(3));

        ArrayList<Integer> result2 = result.get(1);
        assertEquals(-2, (int) result2.get(0));
        assertEquals(0, (int) result2.get(1));
        assertEquals(0, (int) result2.get(2));
        assertEquals(2, (int) result2.get(3));

        ArrayList<Integer> result3 = result.get(2);
        assertEquals(-1, (int) result3.get(0));
        assertEquals(0, (int) result3.get(1));
        assertEquals(0, (int) result3.get(2));
        assertEquals(1, (int) result3.get(3));
    }

}
