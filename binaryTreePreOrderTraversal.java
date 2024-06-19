/**
Given the root of a binary tree, return the preorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

**/


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode root, List<Integer> r){
        if(root == null){
            return;
        }

        r.add(root.val);
        helper(root.left, r);
        helper(root.right, r);
    }
}
