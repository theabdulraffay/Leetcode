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
    TreeNode hehe;
    int max = 0;
    int helper(TreeNode root, int depth) {
        if(root == null) {
            max = Math.max(max, depth);
            return depth;
        }
        int left = helper(root.left, depth + 1);
        int right = helper(root.right, depth + 1);
        if(left == right && left == max) hehe = root;
        return Math.max(left, right);
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        helper(root, 0);
        return hehe;
        
    }
}
