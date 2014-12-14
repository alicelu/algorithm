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
public class TestThreeSumClosest {

    @Test
    public void testThreeSumClosest() {
        int[] numbers = new int[] { -1, 2, 1, -4 };
        int target = 1;

        ArrayList<Integer> result = ThreeSumClosest.threeSumClosest(numbers, target);
        assertEquals(-1, (int) result.get(0));
        assertEquals(1, (int) result.get(1));
        assertEquals(2, (int) result.get(2));

    }

}
