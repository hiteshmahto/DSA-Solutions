// Non Repeating Character
// Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
// Note: When you return '$' driver code will output -1.

package GeeksforGeeks;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(nonRepeatingChar(s));
    }

    public static char nonRepeatingChar(String s) {
        // Approach 2
        // Time Complexity: O(2n) --> O(n) (linear)
        // Space Complexity: O(k) (linear in the number of unique characters, up to O(n))

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charFrequencyMap.containsKey(ch)) charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            else charFrequencyMap.put(ch, 1);
            // Instead of above if-else you can do it like this also:
            // charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charFrequencyMap.get(ch) == 1) return ch;
        }
        return '$';
    }

    /*
    public static char nonRepeatingChar(String s) {
        // Approach 1
        // Time Complexity: O(n^2) 
        // Space Complexity: O(1)
        
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return s.charAt(i);
        }
        return '$';
    }
    */
}
