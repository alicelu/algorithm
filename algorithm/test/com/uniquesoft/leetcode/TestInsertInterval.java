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
public class TestInsertInterval {

    @Test
    public void testInsertInterval() {
        List<Interval> intervals1 = new ArrayList<Interval>();
        intervals1.add(new Interval(1, 3));
        intervals1.add(new Interval(6, 9));

        Interval newInterval1 = new Interval(2, 5);

        List<Interval> result = InsertInterval.insertInterval(intervals1, newInterval1);

        assertEquals(1, result.get(0).start);
        assertEquals(5, result.get(0).end);
        assertEquals(6, result.get(1).start);
        assertEquals(9, result.get(1).end);

        List<Interval> intervals2 = new ArrayList<Interval>();
        intervals2.add(new Interval(1, 2));
        intervals2.add(new Interval(3, 5));
        intervals2.add(new Interval(6, 7));
        intervals2.add(new Interval(8, 10));
        intervals2.add(new Interval(12, 16));

        Interval newInterval2 = new Interval(4, 9);

        List<Interval> result2 = InsertInterval.insertInterval(intervals2, newInterval2);

        assertEquals(1, result2.get(0).start);
        assertEquals(2, result2.get(0).end);
        assertEquals(3, result2.get(1).start);
        assertEquals(10, result2.get(1).end);
        assertEquals(12, result2.get(2).start);
        assertEquals(16, result2.get(2).end);
    }

}
