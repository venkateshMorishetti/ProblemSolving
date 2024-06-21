/**

Given the root of a complete binary tree, return the number of the nodes in the tree.

Example 2:

Input: root = []
Output: 0
Example 3:

Input: root = [1]
Output: 1

**/

class Solution {
    public int countNodes(TreeNode root) {
        return preOrderTraversal(root);
    }

    public int preOrderTraversal(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+preOrderTraversal(root.left)+ preOrderTraversal(root.right);
    }
}


