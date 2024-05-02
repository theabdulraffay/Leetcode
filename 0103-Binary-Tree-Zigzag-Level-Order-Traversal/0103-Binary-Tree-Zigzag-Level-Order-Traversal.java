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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
    	Deque<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	if (root == null) return list;
    	boolean reverse = false;

    	while (!queue.isEmpty()) {
    		int levelSize = queue.size();
    		List<Integer> level = new ArrayList<>(levelSize);
    		for (int i = 0; i < levelSize; i++) { 
    			if (!reverse) {
    				TreeNode temp = queue.pollFirst();
	    			level.add(temp.val);
	    			if(temp.left != null) queue.addLast(temp.left);
	    			if(temp.right != null) queue.addLast(temp.right);
    			} else {
    				TreeNode temp = queue.pollLast();
	    			level.add(temp.val);
	    			if(temp.right != null) queue.addFirst(temp.right);
	    			if(temp.left != null) queue.addFirst(temp.left);
    			}
    		}
    		reverse = !reverse;
    		list.add(level);
    	}
    	return list;
        
    }
}
