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
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }
}
