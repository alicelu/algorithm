/**
 * 
 */
package com.uniquesoft.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author alicelu
 *
 */
public class TestMergeIntervals {

    @Test
    public void testMergeIntervals() {
        List<Interval> intervals = new ArrayList<Interval>();

        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(10, 14));
        intervals.add(new Interval(15, 19));
        intervals.add(new Interval(16, 17));
        intervals.add(new Interval(19, 21));

        List<Interval> result = MergeIntervals.mergeIntervals(intervals);

        assertEquals(1, result.get(0).start);
        assertEquals(6, result.get(0).end);
        assertEquals(8, result.get(1).start);
        assertEquals(14, result.get(1).end);
        assertEquals(15, result.get(2).start);
        assertEquals(21, result.get(2).end);
    }

}
