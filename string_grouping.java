

/**
input = {"java", "abc", "bac","cab", "avaj", "aavj", "ajva"};
output = [[java, avaj, aavj, ajva], [abc, bac, cab]]
**/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String[] input = new String[]{"java", "abc", "bac","cab", "avaj", "aavj", "ajva"};
        ArrayList<ArrayList<String>> result = new ArrayList();
        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < input.length-1; i++){
            String word = input[i];
            String sortedWord = sortWord(input[i]);
            if(map.containsKey(sortedWord)){
                break;
            }
            map.put(sortedWord, 0);
            ArrayList<String> group = new ArrayList();
            group.add(word);
            for(int j = i+1; j < input.length;j++){
                String sortedCurrentWord = sortWord(input[j]);
                if(sortedWord.equals(sortedCurrentWord)){
                    group.add(input[j]);
                }
            }
            result.add(group);
        }
        
        System.out.println(result);
    }
    
    public static String sortWord(String s){
        String[] a = s.split("");
        Arrays.sort(a);
        return Arrays.toString(a).replace("[","").replace("]", "").replaceAll(",", "").replaceAll(" ", "");
    }
}
