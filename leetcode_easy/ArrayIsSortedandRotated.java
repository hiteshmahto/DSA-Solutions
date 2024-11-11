// 1752. Check if Array Is Sorted and Rotated
// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false
// There may be duplicates in the original array


package leetcode_easy;

public class ArrayIsSortedandRotated {
    public static void main(String[] args) {
        // int[] nums = {4, 5, 6, 7, 1, 2, 3};
        int[] nums = {1, 1, 1, 1, 1, 1};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}
