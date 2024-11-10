// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

package leetcode_easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {10, 84, 65, 78, 34, 21, 99, 11, 54, 88, 54};
        int target = 55;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
