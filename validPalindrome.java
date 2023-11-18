/**
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

**/

class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll(" ","").replaceAll("[,.:@#$%&*_'\\\"\\[\\]{}\\-?;!()`]", "");
        s = s.toLowerCase();
        String[] sA = s.split("");
        String sR ="";
        for(int i = sA.length-1; i>=0; i--){
            sR += sA[i];
        }
        System.out.println(s);
        return sR.equals(s);
        
    }
}
