// 189. Rotate Array
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

package leetcode_medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
