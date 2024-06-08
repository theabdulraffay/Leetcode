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
    int helper(TreeNode root, int sum) {
        if(root == null) return sum;
        int right = helper(root.right, sum);
        int left = helper(root.left, root.val + right);
        root.val += right;
        return left;
    }
    public TreeNode bstToGst(TreeNode root) {
        helper(root, 0);
        return root;
        
    }
}
