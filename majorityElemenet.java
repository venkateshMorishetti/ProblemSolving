/**


Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

**/

//with sort
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[(nums.length/2)+i]){
                return nums[i];
            }
        }
        return -1;
    }
}

//with hashmap

class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap();
       for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1); 
        }else{
            map.put(nums[i],1);
        }
       }

       System.out.println(map);

       for(int i: map.keySet()){
            if(map.get(i) >= (nums.length/2)+1){
                return i;
            }
       }

       return -1;
    }
}


//moore voting
class Solution {
    public int majorityElement(int[] nums) {
      
      int maj_index = 0, count = 1;
      for(int i = 1; i < nums.length; i++){
        if(nums[i] == nums[maj_index]){
            count++;
        }else{
            count--;
            if(count == 0){
                maj_index = i;
                count++;
            }
        }
      }

      return nums[maj_index];
    }
}
