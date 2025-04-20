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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str = new ArrayList<>();
        if (root == null)
            return null;
        result(root, str, "");
        return str;
    }

    public static void result(TreeNode root, List<String> str, String s) {
        if (root == null)
            return;
        s = s + Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            str.add(s);
        }
        s += "->";
        result(root.left, str, s);
        result(root.right, str, s);
    }
}
