// 167. Two Sum II - Input Array is Sorted

package medium;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {10, 11, 21, 23, 34, 43, 52, 58, 62, 70, 87, 89, 93, 99};
        int target = 97;
        
        int[] result = twoSum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            } else {
                return new int[] {left + 1, right + 1}; // 1-based indices
            }
        }
        
        return null; // No solution found
    }
}
