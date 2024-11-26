// Rotate Array
// Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.

// ---- OPTIMAL APPROACH - with constant space ----
// TC - O(2n)
// SC - O(1)

package GeeksforGeeks;

import java.util.Arrays;

public class RotateArraySol2 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArr(int arr[], int d) {
        d = d % arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    private static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
