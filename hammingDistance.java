/**

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

 

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1


**/

class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX= "", binaryY="";

        while(x!=0){
            int d = x%2;
            binaryX = d+binaryX;
            x = x/2;
        }

        while(y!=0){
            int d = y%2;
            binaryY = d+binaryY;
            y = y/2;
        }

        if(binaryX.length() != binaryY.length()){
            if(binaryX.length() < binaryY.length()){
                int diff = binaryY.length() - binaryX.length();
                for(int i = 0; i < diff; i++){
                    binaryX  =0+binaryX;
                }
            } else{
               int diff =  binaryX.length() - binaryY.length();
                for(int i = 0; i < diff; i++){
                    binaryY = 0+binaryY;
                } 
            }
        }

        int res = 0;

        for(int i = 0; i < binaryX.length(); i++){
            if(binaryX.charAt(i) != binaryY.charAt(i)){
                res++;
            }
        }

        return res;

    }
}
