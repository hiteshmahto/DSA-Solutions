// Max Circular Subarray Sum
// Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.

// ---- TIME LIMIT EXCEEDED ----

package GeeksforGeeks;

public class MaxCircularSubarraySumSol1 {
    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }

    public static int circularSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int currentSum = KadaneAlgorithm(arr);
            if(currentSum > maxSum) maxSum = currentSum;
            rotateArray(arr);
        }
        return maxSum;
    }

    private static void rotateArray(int arr[]) {
        int lastEle = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = lastEle;
    }

    private static int KadaneAlgorithm(int arr[]) {
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
