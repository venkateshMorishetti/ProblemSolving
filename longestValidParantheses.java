/**

Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
substring
.Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

**/

class Solution {
    public int longestValidParentheses(String s) {

        int result = 0;
        for(int i =0; i < s.length()-1; i++){
            for(int j = i+1; j < s.length(); j++){
                if(isValidParentheses(s.substring(i,j+1)) > result){
                    result = isValidParentheses(s.substring(i,j+1));
                }
            }
        }
        return result;
    }

    public int isValidParentheses(String s){
        Stack<String> st = new Stack();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i)== '('){
                st.push("(");
            }else{
                if(st.size() >0){
                    st.pop();
                }else{
                    return -1;
                }
            }
        }
        if(st.size()>0){
            return -1;
        }
        return s.length();
    }
}
