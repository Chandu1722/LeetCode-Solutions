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
    public int findBottomLeftValue(TreeNode root) {
        int[] level = { -1, -1 };
        int ans = 0;
        bottomLeftMost(root, level, ans);
        return level[1];
    }

    public void bottomLeftMost(TreeNode root, int[] level, int ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (ans > level[0]) {
                level[0] = ans;
                level[1] = root.val;
            }
        }
        if (root.left != null) {
            ans++;
            bottomLeftMost(root.left, level, ans);
            ans--;
        }
        if (root.right != null) {
            ans++;
            bottomLeftMost(root.right, level, ans);
            ans--;
        }
    }
}
