/**

Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]

**/

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList();
        findPaths(root,"", result);
        return result;
    }

    public void findPaths(TreeNode root, String pathTillNow, List<String> result){
        if(root == null){
            return;
        }

        if(pathTillNow.length() == 0){
            pathTillNow = root.val+"";
        }else{
            pathTillNow += "->"+root.val;
        }
        if(root.left == null && root.right == null){
            result.add(pathTillNow);
        }
        findPaths(root.left, pathTillNow, result);
        findPaths(root.right, pathTillNow, result);
    }
}
