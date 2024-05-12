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
    TreeNode helper(TreeNode root) {
        if(root.right == null) return root.left;
        else if(root.left == null) return root.right;
        else {
            TreeNode left = root.left;
            TreeNode right = root.right;
            TreeNode topright = left;
            while(topright.right != null) {
                topright = topright.right;
            }
            topright.right = right;
            return left;

        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) return helper(root);
        else {
            TreeNode temp = root;
            while(root != null) {
                if(root.val > key) {
                    if(root.left != null && root.left.val == key) {
                        root.left = helper(root.left);
                        break;
                    }
                    root = root.left;
                }
                else {
                    if(root.right != null && root.right.val == key) {
                        root.right = helper(root.right);
                        break;
                    }
                    root = root.right;
                }
            }
            return temp;
        }
        
    }
}
