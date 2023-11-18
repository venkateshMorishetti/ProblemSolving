
/**
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
**/

 
class Solution {
    public String convertToTitle(int columnNumber) {
      
        String result = "";
        while(columnNumber >0){
            int rem = columnNumber % 26;
            if(rem == 0){
                result = "Z"+result;
                columnNumber = (columnNumber/26)-1;
            }else{
                result=(char)((rem-1)+'A')+result;
                columnNumber = columnNumber/26;
            }
           
        }
    return result;
    }
}
