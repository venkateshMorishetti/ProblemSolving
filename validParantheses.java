/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
    

    Example 1:

    Input: s = "()"

    Output: true

    Example 2:

    Input: s = "()[]{}"

    Output: true
 */
class Solution {
    public boolean isValid(String s) {
        HashMap<String, String> pairMap = new HashMap();
        pairMap.put("}", "{");
        pairMap.put(")", "(");
        pairMap.put("]", "[");
        Stack<String> st = new Stack();

        String[] inputArray = s.split("");
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].equals("(") || inputArray[i].equals("{") || inputArray[i].equals("[")){
                st.push(inputArray[i]);
            } else {
                String correspondingOpen = pairMap.get(inputArray[i]);
                if(st.size() == 0) return false;
                if(!correspondingOpen.equals(st.peek())){
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        return st.size()!= 0 ? false: true;
    }
}