// 31. Next Permutation
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

package leetcode_medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private static void reverseArray(int[] nums, int begin, int end) {
        while (begin < end) {
            swap(nums, begin, end);
            begin++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int size = nums.length;
        int index = -1;
        for(int i = size - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) {
            reverseArray(nums, 0, size - 1);
            return;
        }
        for(int i = size - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        reverseArray(nums, index + 1, size - 1);
    }
}
