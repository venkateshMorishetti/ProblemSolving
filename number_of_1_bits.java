
/**

Write a function that takes the binary representation of a positive integer and returns the number of 
set bits
 it has (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

**/

class Solution {
public int hammingWeight(int n) {

        String bitRepresentation = "";
        while(n!= 0){
            int remainder = n%2;
            bitRepresentation+= remainder;
            n = n/2;
        }

        String[] a = bitRepresentation.split("");
        System.out.println(Arrays.toString(a));
        int c = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i].equals("1")){
                c++;
            }
        }
        return c;
    }
};
