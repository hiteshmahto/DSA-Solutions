// Add Binary Strings
// Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
// Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

// L => max(length of s1, length of s2)
// TC - O(3L)
// SC - O(L)

package GeeksforGeeks;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String s1 = "00100";
        String s2 = "010";
        System.out.println(addBinary(s1, s2));
    }

    public static String addBinary(String s1, String s2) {
        int n = s1.length() - 1;
        int m = s2.length() - 1;
        int carry = 0, base = 2;
        StringBuilder result = new StringBuilder();

        while (n >= 0 || m >= 0) {
            int num1 = (n >= 0) ? s1.charAt(n--) - '0' : 0;
            int num2 = (m >= 0) ? s2.charAt(m--) - '0' : 0;
            int sum = num1 + num2 + carry;
            carry = sum / base;
            result.append(sum % base);
        }

        if (carry > 0) result.append(carry);
        result.reverse();
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
