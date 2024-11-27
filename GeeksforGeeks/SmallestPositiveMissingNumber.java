// Smallest Positive Missing Number
// You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

// Note: Positive number starts from 1. The array can have negative integers too.

// TC - O(3n)
// SC - O(1)

package GeeksforGeeks;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) arr[i] = 0;
        }

        for(int i = 0; i < arr.length; i++) {
            int value = Math.abs(arr[i]);
            if(1 <= value && value <= arr.length) {
                if(arr[value - 1] > 0) arr[value - 1] *= -1;
                else if(arr[value - 1] == 0) arr[value - 1] = -1 * (arr.length + 1);
            }
        }

        for(int i = 1; i <= arr.length; i++) {
            if(arr[i - 1] >= 0) return i;
        }
        return arr.length + 1;
    }
}
