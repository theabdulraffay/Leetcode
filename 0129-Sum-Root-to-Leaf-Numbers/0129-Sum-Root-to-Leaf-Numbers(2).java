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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
         helper(root, 0);
          return sum;        
    }

    void helper(TreeNode root, int sumTillNow) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            sumTillNow = root.val + (sumTillNow * 10);
            sum += sumTillNow;
        }
        helper(root.left, root.val + (sumTillNow *10));
        helper(root.right, root.val + (sumTillNow * 10));
    }
}
