/**
 * You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.

 

Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters in word are 'a', 'b', and 'c'.

Example 2:

Input: word = "abc"

Output: 0

Explanation:

No character in word appears in uppercase.

Example 3:

Input: word = "abBCab"

Output: 1

Explanation:

The only special character in word is 'b'.
 */



import java.util.*;

class Solution {
    public int numberOfSpecialChars(String word) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> visited = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // System.out.println("char---> "+ch);

            if (ch >= 'A' && ch <= 'Z' && map.containsKey(Character.toLowerCase(ch)) && !visited.containsKey(Character.toLowerCase(ch)) ) {     
                res++;
                map.remove(Character.toLowerCase(ch));
                visited.put(Character.toLowerCase(ch), 1);
            } else if (ch >= 'a' && ch <= 'z' && map.containsKey(Character.toUpperCase(ch)) && !visited.containsKey(Character.toLowerCase(ch))) {
                res++;
                map.remove(Character.toUpperCase(ch));
                visited.put(Character.toLowerCase(ch), 1);
            } else {
                map.put(ch, 1);
            }
        }

        return res;
    }
}