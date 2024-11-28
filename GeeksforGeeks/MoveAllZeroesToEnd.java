// Move All Zeroes to End
// Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

// TC - O(n)
// SC - O(1)

package GeeksforGeeks;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void pushZerosToEnd(int[] arr) {
        // Find the first zero
        int j = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If there are no zeroes, return
        if(j == -1) return;

        // Move non-zero elements to the left and zeroes to the right
        for(int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
