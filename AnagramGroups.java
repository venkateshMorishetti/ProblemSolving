/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

    Example: For strs = ["eat", "tea", "tan", "ate", "nat", "bat"]:

    The output should be [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]].

    Explanation:

    "eat", "tea", and "ate" are anagrams (all contain 'e', 'a', 't')
    "tan" and "nat" are anagrams (all contain 't', 'a', 'n')
    "bat" stands alone
 */

class Main {
    public static void main(String[] args) {
       String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
       
       HashMap<String, List<String>> res = new HashMap();
       
       for(int i = 0; i < input.length; i++){
           char[] s = input[i].toCharArray();
           Arrays.sort(s);
           String sorted = new String(s);
           if(res.containsKey(sorted)){
               List<String> l = res.get(sorted);
               l.add(input[i]);
               res.put(sorted, l);
           } else {
               List<String> l = new ArrayList();
               l.add(input[i]);
               res.put(sorted, l);
           }
       }
       
       List<List<String>> li = new ArrayList();
        for(String l: res.keySet()){
            li.add(res.get(l));
        }
        System.out.println(li);
    }
}