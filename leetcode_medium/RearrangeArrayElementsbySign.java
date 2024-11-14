// 2149. Rearrange Array Elements by Sign
// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.

package leetcode_medium;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return ans;
    }
}
