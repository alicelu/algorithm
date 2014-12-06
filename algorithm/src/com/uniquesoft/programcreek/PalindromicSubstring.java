/**
 * 
 */
package com.uniquesoft.programcreek;

/**
 * @author lusha
 * Notes:
 * 1. Moving Center Point for Symmetric String
 * 2. Check center point for 1 and 2 letters
 */
public class PalindromicSubstring {

    public static void main(String[] args) {
        String s1 = "ababccbacc";
        String s2 = "abcbcbcad";
        System.out.println("Result1: " + longestPalindromic(s1));
        System.out.println("Result2: " + longestPalindromic(s2));
    }

    public static String longestPalindromic(String s) {
        if (s.length() == 1) {
            return s;
        }

        String longestPalin = "";

        for (int i = 1; i < s.length() - 1; i++) {
            String rlt1 = helper(s, i, i);
            if (longestPalin.length() < rlt1.length()) {
                longestPalin = rlt1;
            }
            String rlt2 = helper(s, i, i + 1);
            if (longestPalin.length() < rlt2.length()) {
                longestPalin = rlt2;
            }
        }
        return longestPalin;
    }

    private static String helper(String s, int start, int end) {
        String rlt = "";
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                rlt = s.substring(start, end + 1);
                start--;
                end++;
            } else {
                break;
            }
        }
        return rlt;
    }

    // Check all possible subString
    public static String longestPalindromic1(String s) {
        int maxPalinLen = 1;
        String maxPalin = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String curr = s.substring(i, j + 1);
                if (checkPalin(curr)) {
                    if (j - i > maxPalinLen) {
                        maxPalinLen = j - i;
                        maxPalin = curr;
                    }
                }
            }
        }

        return maxPalin;
    }

    private static boolean checkPalin(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
