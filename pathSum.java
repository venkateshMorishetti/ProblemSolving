/**

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.
Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.



**/
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> s = new ArrayList();
        helper(root, 0, s);   
        for(int i = 0; i < s.size(); i++){
            if(s.get(i) == targetSum){
                return true;
            }
        }
        return false;
    }

    public void helper(TreeNode r,int currentSum, List<Integer> sumResults){
        if(r == null){
            return;
        }

        currentSum += r.val;
        if(r.left == null && r.right == null){
            sumResults.add(currentSum);
            return;
        }
        helper(r.left, currentSum, sumResults);
        helper(r.right, currentSum, sumResults);
    }
}
