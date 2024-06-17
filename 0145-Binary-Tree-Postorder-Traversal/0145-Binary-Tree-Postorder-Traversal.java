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
    void postorderTraversal(TreeNode root, List<Integer> m) {
        if(root == null) return;
        postorderTraversal(root.left, m);
        postorderTraversal(root.right, m);
        m.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> m = new ArrayList<>();
        postorderTraversal(root, m);
        return m;
    }
}
