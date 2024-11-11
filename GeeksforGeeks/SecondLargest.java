// Second Largest Element in the Array

package GeeksforGeeks;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 35, 34, 15};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
