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
    int res;
    public int longestZigZag(TreeNode root) {
        res = 0;
        dfs(root, 1);
        return res;
    }
  
    public int dfs(TreeNode root, int from){
        if(root == null) return -1;
        int l = dfs(root.left, 1) + 1;
        int r = dfs(root.right, 2) + 1;
        res = Math.max(res, l);
        res = Math.max(res, r);
        if(from == 1) return r;
        return l;
    }


}
