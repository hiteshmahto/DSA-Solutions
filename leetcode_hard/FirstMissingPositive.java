// 41. First Missing Positive
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// TC - O(3n)
// SC - O(1)

package leetcode_hard;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[] = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) nums[i] = 0;
        }

        for(int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]);
            if(1 <= value && value <= nums.length) {
                if(nums[value - 1] > 0) nums[value - 1] *= -1;
                else if(nums[value - 1] == 0) nums[value - 1] = -1 * (nums.length + 1);
            }
        }

        for(int i = 1; i <= nums.length; i++) {
            if(nums[i - 1] >= 0) return i;
        }
        return nums.length + 1;
    }
}
