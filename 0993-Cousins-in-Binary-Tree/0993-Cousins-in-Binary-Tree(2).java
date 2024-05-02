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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            TreeNode temp = que.peek();
            boolean first = false;
            boolean second = false;
            for (int i = 0; i < size; i++) {
                temp = que.poll();
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
                if((temp.left != null && temp.left.val == x) || ( temp.right != null && temp.right.val == x)) {
                    first = true;
                } else if ((temp.left != null && temp.left.val == y) || (temp.right != null && temp.right.val == y)){
                    second = true;
                }
            }
            if (first && second) {
                return true;
            }
        }
        return false;
        
    }
}
