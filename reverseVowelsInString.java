/**
Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"

**/

class Solution {
    public String reverseVowels(String s) {
        if(s.equals(" ")) return s;
        String[] result = s.split("");
        System.out.println(Arrays.toString(result));

        int fp = 0, lp = s.length()-1;
        while(fp<lp){
            if(isVowel(result[fp])){
                int si = findLastVowel(lp,s);
                lp = si-1;
                String v = result[si];
                result[si] = result[fp];
                result[fp] = v;
            }
            fp++;
        }
        String resultString = "";
        for(int i = 0; i < result.length; i++){
            resultString += result[i];
        }
        return resultString;
    }

    public boolean isVowel(String c){
        if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") || c.equals("A") || c.equals("E") || c.equals("I") || c.equals("O") || c.equals("U")){
            return true;
        }

        return false;
    }

    public int findLastVowel(int li, String s){
        for(int k = li; k>=0; k--){
            String c = s.charAt(k)+"";
            if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") || c.equals("A") || c.equals("E") || c.equals("I") || c.equals("O") || c.equals("U")){
            return k;
            }
        }

        return -1; 
    }
}
