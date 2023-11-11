/**
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

**/


//bruteforce
//timecomplexity = O(N^3)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length-2; i++){
            int a = nums[i];
            for(int j = i+1; j < nums.length-1; j++){
                int b = nums[j];
                for(int k = j+1;k < nums.length; k++){
                    int c = nums[k];
                    if(a+b+c == 0){
                       List<Integer> r = new ArrayList<Integer>();
                       r.add(a);
                       r.add(b);
                       r.add(c);
                       Collections.sort(r);
                       boolean isPresent = false;
                       for(int t = 0; t< result.size(); t++){
                           if(result.get(t).equals(r)){
                               isPresent = true;
                           }
                       }
                       if(!isPresent){
                        result.add(r); 
                       }
                    }
                }
            }
        }

        return result;
    }
}
