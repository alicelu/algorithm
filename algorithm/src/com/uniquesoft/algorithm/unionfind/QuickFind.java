/**
 * 
 */
package com.uniquesoft.algorithm.unionfind;

/**
 * @author lusha
 * 
 */
public class QuickFind {
    private int[] a;

    public QuickFind(int size) {
        a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = i;
        }
    }

    public void union(int p, int q) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[p]) {
                a[i] = a[q];
            }
        }
    }

    public boolean connected(int p, int q) {
        return a[p] == a[q];
    }
}
