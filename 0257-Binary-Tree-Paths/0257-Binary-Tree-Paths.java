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
    String toString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if(i < list.size() - 1) sb.append("->");
        }
        return sb.toString();
    }
    void helper(TreeNode node, List<String> l1, List<Integer> l2) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            l2.add(node.val);
            l1.add(toString(l2));
            l2.remove(l2.size() - 1);
            return;
        }
        l2.add(node.val);
        helper(node.left, l1, l2);
        helper(node.right, l1, l2);
        l2.remove(l2.size() - 1);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        helper(root, list, list2);
        return list;

        
    }
}
