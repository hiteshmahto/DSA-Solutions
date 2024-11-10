// 268. Missing Numbers
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array

// Finds the missing number in the array using XOR
// XORing all numbers in the array and the complete range [0, n] 
// will cancel out all duplicate numbers, leaving only the missing number

package leetcode_easy;

public class MissingNumbersSol2 {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1, 8, 11};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int xorNums = 0;
        int xorRange = 0;
        for(int i = 0; i < nums.length; i++) {
            xorNums ^= nums[i];
            xorRange ^= i;
        }
        xorRange ^= nums.length;
        return xorNums ^ xorRange;
    }
}
