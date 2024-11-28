// 8. String to Integer (atoi)
// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

package leetcode_medium;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if(s == null) return 0;
        s = s.trim();
        if(s.length() == 0) return 0;

        int sign = 1;
        long ans = 0;

        if(s.charAt(0) == '-') sign = -1;
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;

        while (i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + (s.charAt(i) - '0');
            if(sign == -1 && (-1 * ans < Integer.MIN_VALUE)) return Integer.MIN_VALUE;
            if(sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int)(sign * ans);
    }
}
