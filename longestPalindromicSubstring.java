/**

Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"

**/

//bruteforce
//time complexity O(N^3)

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        String o = s.charAt(0)+"";
        for(int i = 0; i < s.length()-1; i++){
            String t = s.charAt(i)+"";
            for(int j = i+1; j < s.length(); j++){
                t += s.charAt(j);
                if(checkPalindromeOrNot(t) && o.length() < t.length()){
                    o = t;
                }
            }
        }

        return o;
        
    }

    public boolean checkPalindromeOrNot(String s){
        for(int i =0, j = s.length()-1; i <=j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
