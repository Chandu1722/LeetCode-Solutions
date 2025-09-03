/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, targetSum, 0, new ArrayList<>());
        return ans;
    }

    public void dfs(TreeNode root, List<List<Integer>> ans, int targetSum, int currSum, List<Integer> currList) {
        if (root == null) {
            return;
        }
        currSum += root.val;
        currList.add(root.val);
        if (root.left == null && root.right == null && targetSum == currSum) {
            ans.add(new ArrayList<>(currList));
        }
        dfs(root.left, ans, targetSum, currSum, currList);
        dfs(root.right, ans, targetSum, currSum, currList);
        currList.remove(currList.size() - 1);
    }
}
