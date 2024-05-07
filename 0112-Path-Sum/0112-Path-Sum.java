/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean left = hasPathSum(root.left, targetSum - root.val);
        if (left) return true;
        return hasPathSum(root.right, targetSum - root.val);

    }
    // sumTillNow is initially set to 0;
    // boolean helper(TreeNode root, int targetSum, int sumTillNow) {
    //     if(root == null) return false;
    //     if (root.left == null && root.right == null) {
    //         return targetSum == sumTillNow + root.val;
    //     }

    //     boolean left = helper(root.left, targetSum, sumTillNow + root.val);
    //     if (left) {
    //         return true;
    //     }
    //     return helper(root.right, targetSum, sumTillNow + root.val);
    // }
}
