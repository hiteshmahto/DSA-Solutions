// 26. Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

package leetcode_easy;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
        System.out.println(removeDuplicates(nums));
        System.out.println("\n" + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
