/**
 * 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 * Example 1:

    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.
    Example 2:

    Input: s = "cbbd"
    Output: "bb"
 */




class Solution {
    public String longestPalindrome(String s) {
        int startIndex=0; 
        int endIndex = 0;
        int resLength = 1;
        //odd length
        for(int i = 0; i < s.length(); i++){
            int low = i;
            int high = i;
            int currentPalindromeLength = 1;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                low--; 
                high++;
                currentPalindromeLength = high-low+1;
            }
            if(currentPalindromeLength > resLength){
                resLength = currentPalindromeLength;
                startIndex = low+1;
                endIndex = high-1;
            }
        }

        //even length
        for(int i = 0; i < s.length(); i++){
            int low = i;
            int high = i+1;
            int currentPalindromCount = high-low+1;
            while(low>=0 && high <s.length() && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                currentPalindromCount = high-low+1;
            }
            if(currentPalindromCount > resLength){
                resLength = currentPalindromCount;
                startIndex = low+1;
                endIndex = high-1;
            }

        }

        return s.substring(startIndex, endIndex+1);
        
    }
}