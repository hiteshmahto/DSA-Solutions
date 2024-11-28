// Repetitive Addition Of Digits
// You are given a positive integer n, you need to add all the digits of n and create a new number. Perform this operation until the resultant number has only one digit in it. Return the final number obtained after performing the given operation.

package GeeksforGeeks;

public class RepetitiveAdditionOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(singleDigit(n));
    }

    public static int singleDigit(int n) {
        // TC - O(1)
        // SC - O(1)
        if(n == 0) return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }

    /*
    public static int singleDigit(int n) {
        // TC - O((log10(n))^2)
        // SC - O(1)
        while(n > 9) {
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    */
}
