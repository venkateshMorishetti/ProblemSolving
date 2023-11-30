/**

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


**/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int startIndex = 0;
        for(int i =0; i < s.length(); i++){
            char current = s.charAt(i);
            int temp = startIndex;
            boolean check = false;
            if(startIndex >= t.length()){
                return false;
            }
            while(temp < t.length()){
                if(t.charAt(temp) == current){
                    check = true;
                    startIndex = temp+1;
                    break;
                }else{
                    temp++;
                }
            }
            if(check == false){
                return false;
            }


        }
        return true;
    }
}
