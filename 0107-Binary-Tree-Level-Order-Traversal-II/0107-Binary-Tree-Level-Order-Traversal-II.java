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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> list = new ArrayList<List<Integer>>();
     	if(root == null) return list;
     	Queue<TreeNode> queue = new LinkedList<TreeNode>();
     	queue.add(root);

     	while(!queue.isEmpty()) {
     		List<Integer> currentLevel = new ArrayList<Integer>();
     		int levelSize = queue.size(); 
     		for(int i = 0; i < levelSize; i++) {
     			Node temp = queue.poll();
     			currentLevel.add(temp.val);
     			if(temp.left != null) queue.add(temp.left);
     			if(temp.right != null) queue.add(temp.right);
     		}
     		list.add(0, currentLevel); // we just add the new currentLevel ist to the first position if the resulting list in this way we get the resulting list as the list that contains all the levels starting from the bottom of the root node
     	}
     	return list; 
        
    }
}
