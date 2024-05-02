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
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	if (root == null) return list;
    	int reverse = 1;

    	while (!queue.isEmpty()) {
    		int levelSize = queue.size();
    		List<Integer> level = new ArrayList<>(levelSize);
    		for (int i = 0; i < levelSize; i++) {
    			TreeNode temp = queue.poll();
    			level.add(temp.val);
    			if(temp.left != null) queue.add(temp.left);
    			if(temp.right != null) queue.add(temp.right);
    		}

    		if (reverse == 1) {
    			reverse = 0;
    		} else {
    			Collections.reverse(level);
    			reverse = 1;
    		}
    		list.add(level);
    	}
    	return list;
        
    }
}
