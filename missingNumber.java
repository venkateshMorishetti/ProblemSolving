/**

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

**/

class Solution {
    public int missingNumber(int[] nums) {
        int s1 = 0, s2 = 0;

        for(int i = 0; i <= nums.length; i++){
            s1 = s1 ^ i;
        }
        for(int i = 0; i < nums.length; i++){
            s2 = s2 ^  nums[i];
        }
        System.out.println(s1);
        System.out.println(s2);
        return s1 ^ s2;

        
    }
}
