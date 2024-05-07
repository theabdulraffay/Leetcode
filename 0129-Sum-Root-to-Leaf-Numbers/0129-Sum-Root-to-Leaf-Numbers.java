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
    public int sumNumbers(TreeNode root) {
         return helper(root, 0);     
    }

    int helper(TreeNode root, int sumTillNow) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return root.val + (sumTillNow * 10);
        }
        return helper(root.left, root.val + (sumTillNow *10)) + helper(root.right, root.val + (sumTillNow * 10));
    }
}
