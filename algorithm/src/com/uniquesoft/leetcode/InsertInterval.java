/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.List;

/**
 * @author alicelu
 *
 */
public class InsertInterval {

    public static List<Interval> insertInterval(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        return MergeIntervals.mergeIntervals(intervals);
    }

}
