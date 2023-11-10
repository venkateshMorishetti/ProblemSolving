/**
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

approach: using count sort alg
timecomplexity = O(N)
space complexity = O(M), M = size of count array 
**/

class Solution {
    public int findKthLargest(int[] nums, int k) {

        //find the maximum element in array
        int max = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++){
            if(nums[i] > max){
                max= nums[i];
            }
        }

        //create max size array
        int[] count = new int[max+1];

        //iterate given array and update freq in count array
        for(int j = 0; j < nums.length; j++){
            count[nums[j]] +=1;
        }
        k = nums.length-k+1;
        int f = 0;
        for(int i =0; i < count.length; i++){
            if(count[i]!=0){
                f+=count[i];
                if(f >= k){
                    return i;
                }
            }
        }

        return -1;
    }
}





