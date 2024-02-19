/**
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4

**/


class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        
        return (n*(n+1)/2)-sum;
    }
}
