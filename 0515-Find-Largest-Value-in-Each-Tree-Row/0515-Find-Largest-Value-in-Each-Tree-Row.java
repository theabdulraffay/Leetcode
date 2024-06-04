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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> toret = new ArrayList<>();
        if(root == null) return toret;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int n = que.size();
            for(int i = 0; i < n;i++) {
                TreeNode te = que.poll();
                if(te.val > max) {
                    max = te.val;
                }
                if(te.left != null) que.add(te.left);
                if(te.right != null) que.add(te.right);
            }
            toret.add(max);
        }
        return toret;
        
    }
}
