/**

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1

**/



class Solution {


    public int titleToNumber(String columnTitle) {
        int output = 0;
        for(int i = columnTitle.length()-1; i >=0; i--){
            Character ch = columnTitle.charAt(i);
            int v = ch - 'A' + 1;
            int pos = (columnTitle.length()-1)-i;
            int s = (int)Math.pow(26,pos)*v;
            output+= s;
        }
        return output;
        
    }
}
