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
    void helper(TreeNode child, int max, int[] counter) {
        if(child == null) return;
        if(child.val >= max) {
            max = child.val;
            counter[0]++;
        }
        helper(child.left, max, counter);
        helper(child.right, max, counter);
    }
    public int goodNodes(TreeNode root) {
        int[] x = new int[1];
        helper(root, root.val, x);
        return x[0];
    }
}
