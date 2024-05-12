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
    void tolist (TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        tolist(root.left, list);
        list.add(root.val);
        tolist(root.right, list);
    }

    TreeNode insert(ArrayList<Integer> nums, int st, int end) {
        if(st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        TreeNode root = new TreeNode(nums.get(mid)); 
        root.left = insert(nums, st, mid - 1);
        root.right = insert(nums, mid + 1, end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        tolist(root, list);
        return insert(list, 0, list.size() - 1);
        
    }
}
