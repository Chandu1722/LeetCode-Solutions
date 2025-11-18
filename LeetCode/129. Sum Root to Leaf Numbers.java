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
    int totalSum;

    public int sumNumbers(TreeNode root) {
        totalSum = 0;
        TreeNode temp = root;
        sumAll(temp, 0);
        return totalSum;
    }

    public void sumAll(TreeNode temp, int sum) {
        if (temp == null) {
            return;
        }
        sum = sum * 10 + temp.val;
        if (temp.left == null && temp.right == null) {
            totalSum += sum;
            return;
        }
        sumAll(temp.left, sum);
        sumAll(temp.right, sum);
    }
}
