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
    void insert(TreeNode r, List<Integer> l) {
        if(r == null) return;
        if(r.left == null && r.right == null) l.add(r.val);
        insert(r.left, l);
        insert(r.right, l);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l = new ArrayList<>();
        insert(root1, l);
        List<Integer> s = new ArrayList<>();
        insert(root2, s);
        return l.equals(s);  
    }
}
