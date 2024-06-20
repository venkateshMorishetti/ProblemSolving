/**
Given the root of a binary tree, invert the tree, and return its root.
Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:
Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }

    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null && root.right != null){
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
        } else if(root.left == null && root.right != null){
            root.left = root.right;
            root.right = null;
        } else if(root.left != null && root.right == null){
            root.right = root.left;
            root.left = null;
        }
        helper(root.left);
        helper(root.right);
    }
}
