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
    int sum(TreeNode root, boolean lef) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null && lef) {
            return root.val;
        }
        int l = sum(root.left, true);
        int p = sum(root.right, false);
        return l + p;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int s = sum(root, false);
        return s;
        
    }
}
