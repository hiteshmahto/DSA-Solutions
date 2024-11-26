package leetcode_medium;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1;
        int maxProductNum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];
            if(prefix >= suffix && prefix > maxProductNum) maxProductNum = prefix;
            if(suffix >= prefix && suffix > maxProductNum) maxProductNum = suffix;
        }
        return maxProductNum;
    }
}
