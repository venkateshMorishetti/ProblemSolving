/*
    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

    Example 1:

    Input: nums = [1,1,1,2,2,3], k = 2

    Output: [1,2]

    Example 2:

    Input: nums = [1], k = 1

    Output: [1]

    Example 3:

    Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

    Output: [1,2]
 */
class ElementFrequency implements Comparable<ElementFrequency>{
    int element, frequency;
    ElementFrequency(int e, int f){
        element = e;
        frequency = f;
    }

    @Override
    public int compareTo(ElementFrequency that){
        return this.frequency - that.frequency;
    } 

    @Override
    public String toString(){
        return this.element+"--"+this.frequency;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        for(int i=0; i < nums.length; i++){
            if(frequencyMap.containsKey(nums[i])){
                frequencyMap.put(nums[i], frequencyMap.get(nums[i])+1);
            } else {
                frequencyMap.put(nums[i], 1);
            }
        }
        ElementFrequency[] list = new ElementFrequency[frequencyMap.size()];
        int index = 0;
        for(Integer key:frequencyMap.keySet()){
            ElementFrequency e = new ElementFrequency(key, frequencyMap.get(key));
            list[index++] = e;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int[] res = new int[k];
        int i = 0; int p = list.length-1;
        for(int j = k; j >0; j--){
            ElementFrequency ef = list[p--];
            res[i++] = ef.element;
        }

        return res;
    }
}