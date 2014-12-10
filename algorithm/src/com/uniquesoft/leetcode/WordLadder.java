/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lusha
 * 
 */
public class WordLadder {

    private static final Set<String> dict = new HashSet<String>();

    public static void main(String[] args) {
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        System.out.println("Crack Word: " + crackWord("hit", "cog", 0, new ArrayList<String>()));
        System.out.println("Ladder Length: " + ladderLength("hit", "cog"));
    }

    public static int crackWord(String start, String end, int idx, List<String> transform) {
        for (int i = idx; i < start.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                char[] charArr = start.toCharArray();
                charArr[i] = c;
                String tmpStr = new String(charArr);
                if (dict.contains(tmpStr) && !transform.contains(tmpStr)) {
                    transform.add(tmpStr);
                    crackWord(tmpStr, end, idx++, transform);
                }
            }
        }

        return transform.size();
    }

    public static int ladderLength(String start, String end) {
        int len = 0;
        HashSet<String> visited = new HashSet<String>();

        for (int i = 0; i < start.length(); i++) {
            char[] startArray = start.toCharArray();
            for (char c = 'a'; c <= 'z'; c++) {
                if (startArray[i] != c) {
                    startArray[i] = c;
                    String tmpString = new String(startArray);
                    if (dict.contains(tmpString)) {
                        start = tmpString;
                        visited.add(start);
                        System.out.println("Transformation: " + start);
                        len++;
                        if (start.equals(end)) {
                            return len;
                        }
                    }
                }
            }
        }

        return len;
    }
}
