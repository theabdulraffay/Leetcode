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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null) return list;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            TreeNode temp = que.peek();
            for (int i = 0; i < size; i++) {
                temp = que.poll();
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
                if(i == size - 1) list.add(temp.val);
            }
        }
        return list;
    }
}
