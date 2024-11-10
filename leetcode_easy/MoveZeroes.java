package leetcode_easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        int j = -1;
        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If there are no zeroes, return
        if (j == -1) return;

        // Move non-zero elements to the left and zeroes to the right
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j to the next zero position
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
