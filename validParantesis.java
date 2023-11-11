/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true

**/
//timecomplexity = O(N)
//space complexity =O(N)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack();
        // if(s.length() == 1) return false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i)== '[' )
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ']' && st.size() > 0 && st.peek() != '['){
                return false;
            }
            else if(s.charAt(i) == '}' &&  st.size() > 0 && st.peek() != '{'){
                return false;
            }
            else if(s.charAt(i) == ')' && st.size() > 0 &&  st.peek() != '('){
                return false;
            } else if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i)== ']' ) && st.size() == 0 ){
                return false;
            }
            else{
                st.pop();
            }
        }

        if(st.size() !=0){
            return false;
        }

        return true;
        
    }
}
