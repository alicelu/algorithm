/**
 * 
 */
package com.uniquesoft.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author alicelu
 *         Key to the solution is use 2 pointers to loop through the array instead of one.
 */
public class ThreeSumClosest {

    public static ArrayList<Integer> threeSumClosest(int[] numbers, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (numbers.length < 3) {
            return result;
        }

        Arrays.sort(numbers);

        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length - 2; i++) {
            if ((i == 0) || (numbers[i] > numbers[i - 1])) {
                int start = i + 1;
                int end = numbers.length - 1;

                while (start < end) {
                    int sum = numbers[i] + numbers[start] + numbers[end];

                    if (fabs(sum, target) == 0) {
                        result.clear();
                        result.add(numbers[i]);
                        result.add(numbers[start]);
                        result.add(numbers[end]);
                        return result;
                    }

                    if (fabs(sum, target) < closest) {
                        result.clear();
                        result.add(numbers[i]);
                        result.add(numbers[start]);
                        result.add(numbers[end]);
                        closest = fabs(sum, target);
                    }

                    if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return result;
    }

    private static int fabs(int a, int b) {
        return a > b ? a - b : b - a;
    }

}
