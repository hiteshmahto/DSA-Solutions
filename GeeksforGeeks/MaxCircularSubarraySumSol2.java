// // Max Circular Subarray Sum
// Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.

package GeeksforGeeks;

public class MaxCircularSubarraySumSol2 {
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }

    public static int circularSubarraySum(int arr[]) {
        int totalArraySum = 0;
        for(int num : arr) totalArraySum += num;
        int maxSubarraySum = kadaneFindMaxSubarraySum(arr);
        int minSubarraySum = kadaneFindMinSubarraySum(arr);
        int maxCircularSum = totalArraySum - minSubarraySum;
        if(maxSubarraySum > 0) return Math.max(maxSubarraySum, maxCircularSum);
        return maxSubarraySum;
    }

    private static int kadaneFindMaxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : arr) {
            if(currentSum < 0) currentSum = 0;
            currentSum += num;
            if(currentSum > maxSum) maxSum = currentSum;
        }
        return maxSum;
    }

    private static int kadaneFindMinSubarraySum(int arr[]) {
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        for (int num : arr) {
            if (currentSum > 0) currentSum = 0;
            currentSum += num;
            if (currentSum < minSum) minSum = currentSum;
        }
        return minSum;
    }
    
}
