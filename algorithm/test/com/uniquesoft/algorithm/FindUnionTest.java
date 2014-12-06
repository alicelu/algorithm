/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uniquesoft.algorithm.unionfind.BalancedUnion;
import com.uniquesoft.algorithm.unionfind.QuickFind;
import com.uniquesoft.algorithm.unionfind.QuickUnion;

/**
 * @author lusha
 * 
 */
public class FindUnionTest {

    @Test
    public void testQuickFind() {
        QuickFind qf = new QuickFind(10);
        qf.union(1, 2);
        qf.union(2, 5);
        qf.union(4, 5);
        assertEquals(true, qf.connected(1, 5));
        assertEquals(false, qf.connected(3, 5));
        assertEquals(true, qf.connected(1, 4));
    }

    @Test
    public void testQuickUnion() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(1, 2);
        qu.union(2, 5);
        qu.union(4, 5);
        assertEquals(true, qu.connected(1, 5));
        assertEquals(false, qu.connected(3, 5));
        assertEquals(true, qu.connected(1, 4));
    }
    
    @Test
    public void testBalancedUnion() {
        BalancedUnion bu = new BalancedUnion(10);
        bu.union(1, 2);
        bu.union(2, 5);
        bu.union(4, 5);
        assertEquals(true, bu.connected(1, 5));
        assertEquals(false, bu.connected(3, 5));
        assertEquals(true, bu.connected(1, 4));
    }
}
