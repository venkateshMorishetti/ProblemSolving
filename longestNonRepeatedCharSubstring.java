/**
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
**/

//bruteforce solution
//timecomplexity = O(N^3)

class Solution {
    public int lengthOfLongestSubstring(String s) {

        
        if(s.length()==0) return 0;
        int count = 1;
        for(int i = 0; i < s.length()-1; i++){
            String t = s.charAt(i)+"";
            for(int j = i+1; j < s.length(); j++){
                t += s.charAt(j)+"";
                if(hasRepeatchars(t) && count < t.length()){
                    count = t.length();
                }
            }
        }
        return count;
    }


    public boolean hasRepeatchars(String s){
        HashMap<Character, Integer> map = new HashMap();
        for(int j = 0; j<s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                return false;
            }else{
                map.put(s.charAt(j),1);
            }
        }

        return true;
    }
}


//second approach
//time complexity = 0(N2)
//space complexity = O(N)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int count  =1;
        for(int i =0; i < s.length(); i++){
            HashMap<Character, Integer> map = new HashMap();
            for(int j = i; j < s.length(); j++){
                if(map.containsKey(s.charAt(j))){
                    if(map.size() > count ){
                        count = map.size();
                    }
                    break;
                }else{
                    map.put(s.charAt(j), 1);
                }
            }
            if(map.size() > count ){
                count = map.size();
            }
            
        }
        return count;
    }
}



