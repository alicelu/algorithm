/**
 * 
 */
package com.uniquesoft.leetcode;

/**
 * @author alicelu
 *         Consider the boundary conditions and exceptions:
 *         1. null or empty string
 *         2. white spaces
 *         3. +/- sign
 *         4. calculate real value
 *         5. handle min & max
 */
public class String2Integer {

    public static int string2Integer(String s) {

        if (null == s || s.length() < 1) {
            return 0;
        }

        s = s.trim();

        double result = 0;
        boolean flag = true;
        int startIdx = 0;

        char[] charArr = s.toCharArray();
        if (charArr[0] == '-') {
            flag = false;
            startIdx++;
        } else if (charArr[0] == '+') {
            startIdx++;
        }

        for (int i = startIdx; i < (s.indexOf('.') > 0 ? s.indexOf('.') : s.length()); i++) {
            result = result * 10 + (charArr[i] - '0');
        }

        if (!flag) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }

}
