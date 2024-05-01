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
    public List<List<Integer>> levelOrder(TreeNode root) {
     	List<List<Integer>> list = new ArrayList<List<Integer>>();
     	if(root == null) return list;
     	Queue<TreeNode> queue = new LinkedList<TreeNode>();
     	queue.add(root);

     	while(!queue.isEmpty()) {
     		List<Integer> nlist = new ArrayList<Integer>();
     		int n = queue.size(); // At this step the size of the queue is exactly same as that of the level of the binary tree
     		for(int i = 0; i < n; i++) { // so we run the loop the number of nodes that this particular level has and add those nodes to the list
     			TreeNode temp = queue.poll();
     			nlist.add(temp.val);
     			if(temp.left != null) queue.add(temp.left);
     			if(temp.right != null) queue.add(temp.right);
     		}
     		list.add(nlist);
     	}
     	return list;


    }
}
