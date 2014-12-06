/**
 * 
 */
package com.uniquesoft.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uniquesoft.algorithm.unionfind.QuickFind;

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
        assertEquals(true, qf.connected(1, 5));
        assertEquals(false, qf.connected(3, 5));
    }

}
