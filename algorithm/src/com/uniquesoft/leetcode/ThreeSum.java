/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author alicelu
 *
 */
public class ThreeSum {

    public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (numbers.length < 3) {
            return result;
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++) {
            if (i == 0 || (numbers[i] > numbers[i - 1])) {
                int negate = -numbers[i];

                int start = i + 1;
                int end = numbers.length - 1;

                while (start < end) {
                    if ((numbers[start] + numbers[end]) == negate) {
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(numbers[i]);
                        tmp.add(numbers[start]);
                        tmp.add(numbers[end]);

                        result.add(tmp);

                        start++;
                        end--;

                        while (start < end && (numbers[start] == numbers[start - 1])) {
                            start++;
                        }
                        while (start < end && (numbers[end] == numbers[end + 1])) {
                            end--;
                        }
                    } else if (numbers[start] + numbers[end] < negate) {
                        start++;
                    } else {
                        end--;
                    }

                }
            }
        }

        return result;
    }
}
