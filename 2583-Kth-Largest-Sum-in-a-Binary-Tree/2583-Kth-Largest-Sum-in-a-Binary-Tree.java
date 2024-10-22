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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> que = new LinkedList<>();
        PriorityQueue<Long> pque = new PriorityQueue<>();
        que.add(root);
        while(!que.isEmpty()) {
            int n = que.size();
            long sum = 0;
            for(int i = 0; i < n; i++) {
                TreeNode temp = que.poll();
                sum += temp.val;
                if (temp.left != null) que.add(temp.left);
                if (temp.right != null) que.add(temp.right);
            }
            pque.add(sum);
            if(pque.size() > k) pque.poll(); 
        }
        return pque.size() < k ? -1 : pque.peek();
        
    }
}
