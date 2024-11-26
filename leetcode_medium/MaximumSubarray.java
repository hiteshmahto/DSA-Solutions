// 53. Maximum Subarray
// Given an integer array nums, find the subarray with the largest sum, and return its sum

package leetcode_medium;

// This code uses Kadane’s Algorithm to solve the "Maximum Subarray" problem efficiently
// TC - O(n)
// SC - O(1)

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums) {
            currentSum += num;
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
}
