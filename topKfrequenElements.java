/**
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

**/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //using hashmap;

        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        //exchange key to value vicecersa..
        TreeMap<Integer, List<Integer>> reverseMap = new TreeMap(Collections.reverseOrder());

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() >= k){
                if(reverseMap.containsKey(entry.getValue())){
                    reverseMap.get(entry.getValue()).add(entry.getKey());
                }else{
                    List<Integer> l = new ArrayList();
                    l.add(entry.getKey());
                    reverseMap.put(entry.getValue(), l);
                }
            }

        }
        if(reverseMap.size() ==0) return new int[0];
        String r = "";
        for(Map.Entry<Integer, List<Integer>> entry: reverseMap.entrySet()){
            List<Integer> v = entry.getValue();
            for(int f = 0; f <v.size(); f++){
                r+= v.get(f)+" ";
            }
        }


        String[] a = r.split(" ");

        int[] result = new int[a.length];
        for(int f = 0; f < a.length; f++){
            result[f] = Integer.parseInt(a[f]);
        }
        return result;

    }
}
