// 67. Add Binary
// Given two binary strings a and b, return their sum as a binary string.

// L => max(length of a, length of b)
// TC - O(3L)
// SC - O(L)

package leetcode_easy;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int n = a.length() - 1;
        int m = b.length() - 1;
        int carry = 0, base = 2;
        StringBuilder result = new StringBuilder();

        while (n >= 0 || m >= 0) {
            int num1 = (n >= 0) ? a.charAt(n--) - '0' : 0;
            int num2 = (m >= 0) ? b.charAt(m--) - '0' : 0;
            int sum = num1 + num2 + carry;
            carry = sum / base;
            result.append(sum % base);
        }
        if(carry > 0) result.append(carry);
        result.reverse();
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
