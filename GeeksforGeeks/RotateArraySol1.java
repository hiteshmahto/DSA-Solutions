// Rotate Array
// Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.

// ---- BRUTE FORCE ----
// TC - O(n + d)
// SC - O(d)

package GeeksforGeeks;

import java.util.Arrays;

public class RotateArraySol1 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArr(int arr[], int d) {
        d = d % arr.length;
        int temp[] = new int[d];

        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for(int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        for(int i = 0; i < temp.length; i++) {
            arr[arr.length - d + i] = temp[i];
        }
    }
}
