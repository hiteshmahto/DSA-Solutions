// 387. First Unique Character In A String
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

package leetcode_easy;

import java.util.HashMap;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        // Approach 2
        // Time Complexity: O(2n) --> O(n) (linear)
        // Space Complexity: O(k) (linear in the number of unique characters, up to O(n))

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(charFrequencyMap.containsKey(ch)) charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            else charFrequencyMap.put(ch, 1);
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(charFrequencyMap.get(ch) == 1) return i;
        }
        return -1;
    }

    /*
    public static int firstUniqChar(String s) {
        // Approach 1
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)

        for(int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for(int j = 0; j < s.length(); j++) {
                if(i != j && s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }
    */
}
