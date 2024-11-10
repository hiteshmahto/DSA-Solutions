// 268. Missing Numbers
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Solution: using the sum of natural numbers

package leetcode_easy;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1, 8, 11};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        for(int num : nums) {
            sum += num;
        }
        return expectedSum - sum;
    }
}
