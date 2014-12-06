/**
 * 
 */
package com.uniquesoft.programcreek;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author lusha
 * 
 */
public class WordBreak {
    private static final Set<String> dict = new LinkedHashSet<String>();

    public static void main(String[] args) {
        dict.add("ingenious");
        dict.add("interest");
        dict.add("interesting");

        String s1 = "interestingenious";
        String s2 = "helloworld";

        System.out.println("Result1: " + wordBreakHelper(s1, dict, 0));
        System.out.println("Result2: " + wordBreakHelper(s2, dict, 0));

        System.out.println("Result1: " + wordBreak(s1, dict));
        System.out.println("Result2: " + wordBreak(s2, dict));

    }

    /**
     * Match String with words in dictionary, if matched, try matching the rest
     * of String until all matched.
     */
    public static boolean wordBreakHelper(String s, Set<String> dict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (String word : dict) {
            int len = word.length();
            int end = start + len;

            if (end > s.length()) {
                continue;
            }

            if (s.substring(start, start + len).equals(word)) {
                if (wordBreakHelper(s, dict, start + len)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Dynamic Programming
     */
    public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length() + 1];
        t[0] = true;

        for (int i = 0; i < s.length(); i++) {
            if (t[i]) {
                for (String word : dict) {
                    int len = word.length();
                    int end = i + len;
                    if (end <= s.length()) {
                        if (s.substring(i, end).equals(word)) {
                            t[end] = true;
                        }
                    }
                }
            }
        }

        return t[s.length()];
    }
}
