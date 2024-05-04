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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
    		que.add(root.left);
    		que.add(root.right);
    		while (!que.isEmpty()) {
    			TreeNode l = que.poll();
    			TreeNode r = que.poll();
    			boolean a = l == null;
    			boolean b = r == null;
    			if(a && b) {
    				continue;
    			}
    			if(a || b || l.val != r.val) {
    				return false;
    			}
    
    			que.add(l.left);
    			que.add(r.right);
    			que.add(l.right);
    			que.add(r.left);
    		}
    		return true;
        }
