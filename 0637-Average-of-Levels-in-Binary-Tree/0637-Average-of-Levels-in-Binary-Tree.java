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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
     	if(root == null) return list;
     	Queue<TreeNode> queue = new LinkedList<TreeNode>();
     	queue.add(root);

     	while(!queue.isEmpty()){
            double sumOfLevel = 0;
     		int levelSize = queue.size(); 
     		for(int i = 0; i < levelSize; i++) {
     			TreeNode temp = queue.poll();
     			sumOfLevel += (temp.val);
     			if(temp.left != null) queue.add(temp.left);
     			if(temp.right != null) queue.add(temp.right);
     		}
            double avg = sumOfLevel / levelSize;
     		list.add(avg);
     	}
     	return list;
        
    }
}
