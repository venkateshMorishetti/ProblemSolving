/**

Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:

Input: root = [1]
Output: 0

**/

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    public int helper(TreeNode root,boolean isLeftChild){
        if(root == null){
            return 0;
        }

        int s1 = helper(root.left, true);
        int s2 = helper(root.right, false);

        if(isLeftChild && root.left==null && root.right == null){
            return root.val+s1+s2;
        }
        return s1+s2;
    }
}
