// 169. Majority Element
// Given an array nums of size n, return the majority element
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array

package leetcode_easy;

public class MajorityElement {
    public static void main(String[] args) {
        // int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        System.out.println(majorityElement(nums));
    }

    // Boyer-Moore Voting Algorithm to find the majority element
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0]; // Initially assume the first element as the candidate

        for(int num : nums) {
            if (count == 0) {
                count = 1;
                candidate = num;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify if the candidate is the majority element
        // This step is only necessary if there's a possibility that a majority element might not exist.
        // Since this problem assumes that a majority element always exists, Phase 2 can be skipped, and we can directly return the candidate.
        // but I'm not returning directly for you future reference
        count = 0;
        for(int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > (nums.length / 2)) {
            return candidate;
        } else {
            return -1;
        }
    }
}
