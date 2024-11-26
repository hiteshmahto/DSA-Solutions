// Kadane's Algorithm
// Given an integer array arr[]. You need to find the maximum sum of a subarray.

package GeeksforGeeks;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : arr) {
            if(currentSum < 0) currentSum = 0;
            currentSum += num;
            if(currentSum > maxSum) maxSum = currentSum;
        }
        return maxSum;
    }

}
