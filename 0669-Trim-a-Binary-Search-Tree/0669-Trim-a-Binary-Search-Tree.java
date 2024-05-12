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
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        Queue<TreeNode> que = new LinkedList<>();
        while(root != null && (root.val < low || root.val > high)) {
            root = helper(root);
        }
        if(root != null)que.add(root);
        while(!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++) {
                TreeNode temp = que.poll();
                while(temp.left != null && (temp.left.val < low || temp.left.val > high)) {
                    temp.left = helper(temp.left);
                }
                if(temp.left != null)que.add(temp.left);

                while(temp.right != null && (temp.right.val < low || temp.right.val > high)) {
                    temp.right = helper(temp.right);
                }
                if(temp.right != null)que.add(temp.right);
            }
        }
        return root;
    }
}
