/**
Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.

A string is homogenous if all the characters of the string are the same.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: s = "abbcccaa"
Output: 13
Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
**/


class Solution {
    public int countHomogenous(String s) {
        int count  = s.length();
        for(int i = 0; i < s.length()-1; i++){
            String t = s.charAt(i)+"";
            for(int j = i+1; j < s.length(); j++){
                t+=s.charAt(j)+"";
                if(isHomogenousString(t)){
                    count++;
                }
            }
        }
        return (int)(count%(Math.pow(10,9)+7));
    }

    public boolean isHomogenousString(String s){
        
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        // System.out.println(s+" ----->  "+map.size());
        return map.size() ==1;
    }
}
