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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        int counter = 1;
        int level = 0;
        int max = Integer.MIN_VALUE;
        que.add(root);
        while(!que.isEmpty()) {
            int sum = 0;
            int levelSize = que.size();
     		for(int i = 0; i < levelSize; i++) {
     			TreeNode temp = que.poll();
     			sum += temp.val;
     			if(temp.left != null) que.add(temp.left);
     			if(temp.right != null) que.add(temp.right);
     		}
            if(sum > max) {
                max = sum;
                level = counter;
            }
            counter++;
        }
        return level;
        
    }
}
