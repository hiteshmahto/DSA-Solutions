// Maximum Product Subarray
// Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr.

package GeeksforGeeks;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        int prefix = 1, suffix = 1;
        int maxProductNum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= arr[i];
            suffix *= arr[arr.length - i - 1];
            if(prefix >= suffix && prefix > maxProductNum) maxProductNum = prefix;
            if(suffix >= prefix && suffix > maxProductNum) maxProductNum = suffix;
        }
        return maxProductNum;
    }
}