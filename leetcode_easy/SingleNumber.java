// 136. Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.


package leetcode_easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 6, 1, 2, 4, 5, 5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num; // XOR operation cancels out duplicates
        }
        return result;
    }
}
