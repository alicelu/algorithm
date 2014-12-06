/**
 * 
 */
package com.uniquesoft.algorithm.unionfind;

/**
 * @author lusha
 * 
 */
public class BalancedUnion {
    private int id[];
    private int count[];

    public BalancedUnion(int size) {
        id = new int[size];
        count = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
            count[i] = 1;
        }
    }

    private int root(int i) {
        while (id[i] != i) {
            // Improvement to keep the tree flat
            id[i] = id[id[i]];

            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int proot = root(p);
        int qroot = root(q);

        if (count[proot] > count[qroot]) {
            id[qroot] = proot;
            count[proot] += count[qroot];
        } else {
            id[proot] = qroot;
            count[qroot] += count[proot];
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
