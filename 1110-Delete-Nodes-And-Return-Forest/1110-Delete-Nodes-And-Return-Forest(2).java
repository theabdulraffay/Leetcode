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
    List<TreeNode> res;
    // HashSet<Integer> set;
    boolean[] set;
    TreeNode recursion(TreeNode root) {
        if(root == null) return null;
        root.left = recursion(root.left);
        root.right = recursion(root.right);
        if(set[root.val]) {
            if(root.left != null) res.add(root.left);
            if(root.right != null) res.add(root.right);
            return null;
        }
        return root;

    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res= new ArrayList<>();
        // set = new HashSet<>();
        set = new boolean[1001];
        for(int i : to_delete)set[i] = true;
        recursion(root);
        if(!set[root.val]) res.add(root);
        return res;
        
    }
}
