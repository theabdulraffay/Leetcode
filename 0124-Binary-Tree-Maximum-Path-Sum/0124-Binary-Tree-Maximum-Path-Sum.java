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
    int max = 0;
    public int maxPathSum(TreeNode root) {
        max = root.val;
        helper(root);
        return max;
    }

    int helper(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) { 
            if(root.val > max) max = root.val; 
            return root.val;
        }
        int left = helper(root.left);
        left = (left < 0) ? 0 : left;

        int right = helper(root.right);
        right = (right < 0) ? 0 : right;

        int sum = root.val + left + right;
        if(sum > max) max = sum;

        if(left > right) {
            return root.val + left;
        }
        else {
            return root.val + right;
        }
    }
}
