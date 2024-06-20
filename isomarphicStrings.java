/**

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false

**/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        HashMap<Character, Integer> aleradyMappedArray = new HashMap();

        if(s.length() != t.length()){
            return false;
        }

        int i = 0, j= 0;
        while(i < s.length() && j < t.length()){
            if(map.containsKey(s.charAt(i))){
                if( map.get(s.charAt(i)) == t.charAt(j)){
                   //pass
                }else{
                    return false;
                }
            }else{
                if(!aleradyMappedArray.containsKey(t.charAt(j))){
                    map.put(s.charAt(i), t.charAt(j));
                    aleradyMappedArray.put(t.charAt(j), 1);
                } else{
                    return false;
                }
                
            }
            i++;
            j++;
        }
        return true;
    }
}

