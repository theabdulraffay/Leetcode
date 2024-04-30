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
    boolean valid (TreeNode node, int val, boolean left) { // For each node it will check both sides and return boolean value respectively
        if(node == null) return true;
        if(left) {
            if(node.val >= val) {
                return false;
            }
        } else {
            if(node.val <= val) {
                return false;
            }
        }
        boolean leftb = valid(node.left, val, left);
        boolean right = valid(node.right, val, left);
        return leftb && right;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        boolean left = valid(root.left, root.val, true); // We check for each node left and right and repeat this process for every node
        boolean right = valid(root.right, root.val, false);

        boolean f = left && right;
        boolean l = isValidBST(root.left);
        boolean r = isValidBST(root.right);
        return f & l & r;
        
    }
}
