package leetcode_easy;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is Power of Two");
        } else {
            System.out.println(n + " is NOT Power of Two");
        }

        sc.close();
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
