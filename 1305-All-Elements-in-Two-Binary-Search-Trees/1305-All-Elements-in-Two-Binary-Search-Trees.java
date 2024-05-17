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
    
    List<Integer> l = new ArrayList<Integer>();
    void insert(TreeNode r1) {
        if(r1 == null) return;
        insert(r1.left);
        l.add(r1.val);
        insert(r1.right);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        insert(root1);
        insert(root2);
        Collections.sort(l);
        return l;
    }
}
