// 75. Sort Colors - Solution 1
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

package leetcode_medium;

import java.util.Arrays;

public class SortColorsSol1 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0, 2, 1, 0, 0, 1, 2, 0};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int countZero = 0, countOne = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] == 1) {
                countOne++;
            }
        }

        for(int i = 0; i < countZero; i++) {
            nums[i] = 0;
        }
        for(int i = countZero; i < countZero + countOne; i++) {
            nums[i] = 1;
        }
        for(int i = countZero + countOne; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
