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
    public boolean isSymmetric(TreeNode root) {
        return symmetry(root.left, root.right);
    }

    boolean symmetry(TreeNode l, TreeNode r) {
        boolean a = l == null;
        boolean b = r == null;
        if(a && b) return true;
        if (a || b || l.val  != r.val) return false;
        return symmetry(l.left, r.right) && symmetry(l.right, r.left);
        
    }
}
