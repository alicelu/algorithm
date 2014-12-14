/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author alicelu
 *
 */
public class FourSum {

    public static ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

        if (numbers.length < 4) {
            return result;
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 4; i++) {
            if ((i == 0) || (numbers[i] > numbers[i - 1])) {
                int target2 = target - numbers[i];

                for (int j = i + 1; j < numbers.length; j++) {
                    int target3 = target2 - numbers[j];

                    int start = j + 1;
                    int end = numbers.length - 1;

                    while (start < end) {
                        if (numbers[start] + numbers[end] == target3) {
                            ArrayList<Integer> tmp = new ArrayList<Integer>();
                            tmp.add(numbers[i]);
                            tmp.add(numbers[j]);
                            tmp.add(numbers[start]);
                            tmp.add(numbers[end]);

                            if (!set.contains(tmp)) {
                                set.add(tmp);
                                result.add(tmp);
                            }

                            start++;
                            end--;

                            while ((start < end) && (numbers[start] == numbers[start - 1])) {
                                start++;
                            }
                            while ((start < end) && (numbers[end] == numbers[end + 1])) {
                                end--;
                            }
                        } else if (numbers[start] + numbers[end] < target3) {
                            start++;
                        } else {
                            end--;
                        }
                    }
                }
            }

        }

        return result;
    }
}
