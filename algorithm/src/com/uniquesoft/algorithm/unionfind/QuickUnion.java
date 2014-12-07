/**
 * 
 */
package com.uniquesoft.algorithm.unionfind;

/**
 * @author lusha
 * 
 */
public class QuickUnion {

    private int id[];

    public QuickUnion(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    /**
     * Recursively get root of i
     */
    private int root(int i) {
        // TODO Note: for the while loop
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }

    /**
     * Set q's root's root as p's root
     */
    public void union(int p, int q) {
        // TODO Note: root[q] vs id[q]
        int qroot = root(q);
        id[qroot] = root(p);
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
