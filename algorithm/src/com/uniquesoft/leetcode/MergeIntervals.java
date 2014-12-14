/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author alicelu
 *
 */
public class MergeIntervals {

    public static class Interval {
        int start;
        int end;

        public Interval() {
            start = 0;
            end = 0;
        }

        public Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();

        Collections.sort(intervals, new IntervalComparator());

        Interval lastInterval = intervals.get(0);
        result.add(lastInterval);

        for (int i = 1; i < intervals.size(); i++) {
            Interval itv = intervals.get(i);
            if (itv.start > lastInterval.end) {
                lastInterval = itv;
                result.add(lastInterval);
            } else {
                lastInterval.end = lastInterval.end > itv.end ? lastInterval.end : itv.end;
            }
        }

        return result;
    }

    private static class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }

    }
}
