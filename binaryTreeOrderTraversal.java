/**
Given the root of a binary tree, return the postorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]

**/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        helperFunction(root, result);
        return result;
    }

    public void helperFunction(TreeNode root, List<Integer> result1){
        if(root == null){
            return;
        }
        helperFunction(root.left, result1);
        helperFunction(root.right, result1);
        result1.add(root.val);
    }
}   
