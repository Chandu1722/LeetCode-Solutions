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
    int preIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode build(int[] preorder, int[] inorder, int start, int end, HashMap<Integer, Integer> map) {
        if (start > end)
            return null;
        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);
        int index = map.get(val);
        root.left = build(preorder, inorder, start, index - 1, map);
        root.right = build(preorder, inorder, index + 1, end, map);
        return root;
    }
}
