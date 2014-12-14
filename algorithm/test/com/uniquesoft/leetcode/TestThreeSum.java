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
public class TestThreeSum {

    @Test
    public void testThreeSum() {
        int[] numbers = new int[] { -1, 0, 1, 2, -1, -4 };
        ArrayList<ArrayList<Integer>> result = ThreeSum.threeSum(numbers);

        ArrayList<Integer> result1 = result.get(0);
        assertEquals(-1, (int) result1.get(0));
        assertEquals(-1, (int) result1.get(1));
        assertEquals(2, (int) result1.get(2));

        ArrayList<Integer> result2 = result.get(1);
        assertEquals(-1, (int) result2.get(0));
        assertEquals(0, (int) result2.get(1));
        assertEquals(1, (int) result2.get(2));
    }

}
