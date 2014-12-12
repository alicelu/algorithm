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
public class TestMedianSortedArray {

    @Test
    public void testMedianSortedArray() {
        int a1[] = new int[] { 1, 2, 3, 4, 5 };
        int b1[] = new int[] { 6, 7, 8, 9 };

        assertEquals(5, MedianSortedArrays.findMedianSortedArrays(a1, b1), 0);

        int a2[] = new int[] { 1, 3, 5, 7, 9 };
        int b2[] = new int[] { 2, 4, 6, 8 };

        assertEquals(5, MedianSortedArrays.findMedianSortedArrays(a2, b2), 0);

        int a3[] = new int[] { 1, 3, 5, 7, 9 };
        int b3[] = new int[] { 2, 4, 6, 8 };

        assertEquals(5, MedianSortedArrays.findMedianSortedArrays(a3, b3), 0);
    }
}
