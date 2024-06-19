/**
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

in single digit happy number is possible with only 1 or 7. so we are doing that process untill single digit and if its 1 or 7 returning true else return false;
**/

class Solution {
    public boolean isHappy(int n) {
        while(n > 9){
            int temp = n;
            int sum = 0;
            while(temp!=0){
                int digit = temp%10;
                sum += (digit*digit);
                temp = temp/10;
            }
            n = sum;
        }
        if(n ==  1 || n== 7){
            return true;
        }else{
            return false;
        }
    }
}
