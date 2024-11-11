// 75. Sort Colors - Solution 2
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.


// The Dutch National Flag Algorithm
// TC - O(n)
// SC - O(1)

package leetcode_medium;

import java.util.Arrays;

public class SortColorsSol2 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0, 2, 1, 0, 0, 1, 2, 0};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else if (nums[mid]  == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}
