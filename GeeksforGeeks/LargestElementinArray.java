// Largest Element in Array

package GeeksforGeeks;

public class LargestElementinArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
