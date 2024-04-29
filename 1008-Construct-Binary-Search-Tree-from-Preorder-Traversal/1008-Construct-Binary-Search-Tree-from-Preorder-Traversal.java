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
    TreeNode insert(int i, TreeNode root) {
        if (root == null) {
            return new TreeNode(i);
        }
        if (root.val > i) {
            root.left = insert(i, root.left);
        } else {
            root.right = insert(i, root.right);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            root = insert(preorder[i], root);
        }
        return root;
        
    }
}
