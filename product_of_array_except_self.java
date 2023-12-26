/**

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

**/

//bruteforce approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i= 0; i < nums.length ; i++){
            int product_res = 1;
            for(int j=0; j < nums.length; j++){
                if(i!=j){
                    product_res *= nums[j];
                }
            }

            result[i] = product_res;
        }
        return result;
    }   
}

//optimized approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] left_product_array = new int[nums.length];
        int[] right_product_array = new int[nums.length];
        int prod = nums[0];
        left_product_array[0]=1;
        for(int i =1; i < nums.length; i++){
            
            left_product_array[i] = prod;
            prod *= nums[i];
        }

        prod = nums[nums.length-1];
        right_product_array[right_product_array.length-1] = 1;
        for(int i=nums.length-2; i>=0;i--){
            
            right_product_array[i] = prod;
            prod *= nums[i];
        }
        for(int i =0; i < nums.length; i++){
            result[i] = left_product_array[i] * right_product_array[i];
        }

        System.out.println(Arrays.toString(left_product_array));
        System.out.println(Arrays.toString(right_product_array));
        return result;
    }    
}





