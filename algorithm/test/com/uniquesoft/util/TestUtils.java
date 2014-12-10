/**
 * 
 */
package com.uniquesoft.util;

import java.util.List;

/**
 * @author alicelu
 *
 */
public class TestUtils {
    public static String buildStringFromList(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s + " ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
