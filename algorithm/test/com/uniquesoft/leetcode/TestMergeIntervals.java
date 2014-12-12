/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.uniquesoft.leetcode.MergeIntervals.Interval;

/**
 * @author alicelu
 *
 */
public class TestMergeIntervals {

    @Test
    public void testMergeIntervals() {
        List<Interval> intervals = new ArrayList<Interval>();

        MergeIntervals mi = new MergeIntervals();
        intervals.add(mi.new Interval(1, 3));
        intervals.add(mi.new Interval(2, 6));
        intervals.add(mi.new Interval(8, 10));
        intervals.add(mi.new Interval(15, 18));

        List<Interval> result = MergeIntervals.mergeIntervals(intervals);

    }

}
