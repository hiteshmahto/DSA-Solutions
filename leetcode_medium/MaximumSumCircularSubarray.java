// 918. Maximum Sum Circular Subarray

package leetcode_medium;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int nums[] = {5, -3, 5};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalArraySum = 0;
        for(int num : nums) totalArraySum += num;
        int maxSubarraySum = kadaneFindMaxSubarraySum(nums);
        int minSubarraySum = kadaneFindMinSubarraySum(nums);
        int maxCircularSum = totalArraySum - minSubarraySum;
        if(maxSubarraySum > 0) return Math.max(maxSubarraySum, maxCircularSum);
        return maxSubarraySum;
    }

    private static int kadaneFindMaxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : nums) {
            if(currentSum < 0) currentSum = 0;
            currentSum += num;
            if(maxSum < currentSum) maxSum = currentSum;
        }
        return maxSum;
    }

    private static int kadaneFindMinSubarraySum(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        for(int num : nums) {
            if(currentSum > 0) currentSum = 0;
            currentSum += num;
            if(minSum > currentSum) minSum = currentSum;
        }
        return minSum;
    }

}
