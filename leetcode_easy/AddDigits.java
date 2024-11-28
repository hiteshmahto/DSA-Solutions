// 258. Add Digits
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

package leetcode_easy;

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        // TC - O(1)
        // SC - O(1)
        if(num == 0) return 0;
        return (num % 9 == 0) ? 9 : (num % 9);
    }

    /*
    public static int addDigits(int num) {
        // TC - O((log10(n))^2)
        // SC - O(1)
        while(num > 9) {
            int sum = 0;
            while(num > 0) {
                int r = num % 10;
                sum += r;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    */
}
