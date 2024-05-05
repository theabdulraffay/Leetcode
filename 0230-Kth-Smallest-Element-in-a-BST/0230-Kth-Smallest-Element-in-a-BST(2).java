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
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
        
    }
    int counter = 0;
    TreeNode helper(TreeNode root, int k) {
        if(root == null) {
            return root;
        }

        TreeNode left = helper(root.left, k);
        if(left != null) return left;
        counter++;
        if(counter == k){
            return root;
        }
        return helper(root.right, k);
    }
}
