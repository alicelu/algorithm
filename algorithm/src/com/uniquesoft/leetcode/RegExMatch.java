/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.LinkedList;

/**
 * @author alicelu
 *
 */
public class RegExMatch {

    // TODO
    public static boolean isMatch(String s, String p) {

        if (p.contains(".*")) {
            return true;
        }

        LinkedList<String> sList = new LinkedList<String>();
        LinkedList<String> pList = new LinkedList<String>();

        for (char c : s.toCharArray()) {
            sList.add(String.valueOf(c));
        }

        for (char c : p.toCharArray()) {
            pList.add(String.valueOf(c));
        }

        String lastChar = "";
        while (!sList.isEmpty()) {
            String sc = sList.poll();
            String pc = pList.poll();
            if (".".equals(pc)) {
                continue;
            }
            if ("*".equals(pc)) {
                if (!sc.equals(lastChar)) {
                    return false;
                } else {
                    continue;
                }
            }
            if (!sc.equals(pc)) {
                return false;
            }
            lastChar = sc;
        }

        return true;
    }

}
