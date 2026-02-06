/**
 * 451. Sort Characters By Frequency
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

    Return the sorted string. If there are multiple answers, return any of them.

 

    Example 1:

    Input: s = "tree"
    Output: "eert"
    Explanation: 'e' appears twice while 'r' and 't' both appear once.
    So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
    Example 2:

    Input: s = "cccaaa"
    Output: "aaaccc"
    Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
    Note that "cacaca" is incorrect, as the same characters must be together.

 */
class Solution {
    public String frequencySort(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String current = s.charAt(i)+"";
            if(map.containsKey(current)){
                map.put(current, map.get(current)+1);
            } else {
                map.put(current, 1);
            }
        }
        List<Map.Entry<String, Integer>> entries =  new ArrayList<>(map.entrySet());
        entries.sort((a,b) -> b.getValue()- a.getValue());
        System.out.println(entries);
        String res = "";
        for(Map.Entry<String, Integer> entry: entries){
            String ch = entry.getKey();
            int  c = entry.getValue();
            for(int j = 0; j < c; j++){
                res+= ch;
            } 
        }
        return res;
    }
}