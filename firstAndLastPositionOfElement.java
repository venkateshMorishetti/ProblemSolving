/**
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

**/

//bruteforce

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if(nums.length== 1){
            if(nums[0] == target){
                result = new int[]{0,0};
                return result;
            }else{
                return result;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target && result[0] == -1){
                result[0] = i;
            }else if(nums[i] != target && result[0] != -1){
                result[1] = i-1;
                return result;
            }
        }
        if(result[0]!=-1 && result[1] == -1){
            result[1] = nums.length-1;
        }
        return result;
    }
}

//using binary search
//time complexity - O(logn)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if(nums.length== 1){
            if(nums[0] == target){
                result = new int[]{0,0};
                return result;
            }else{
                return result;
            }
        }
        
        //using binary search
        //for first occrance of element
        int low = 0, high = nums.length-1, mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(nums[mid] <target){
                low = mid+1;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                if(mid-1>=low && nums[mid-1] != target){
                    result[0] = mid;
                    break;
                }else if(mid-1>=low && nums[mid-1] == target){
                    high = mid-1;
                }else{
                    result[0] = mid;
                    break;
                }
            }
        }

        //for last occurance of element
        low = 0; high = nums.length-1;mid = 0;
        while(low <= high){
            mid = (low+high)/2;

            if(nums[mid] < target){
                low = mid+1;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                if(mid+1 <= high && nums[mid+1] == target){
                    low = mid+1;
                }else if(mid+1 <= high && nums[mid+1] != target){
                    result[1] = mid;
                    break;
                }else{
                    result[1] = mid;
                    break;
                }
            }
        }

        return result;
    }
}
