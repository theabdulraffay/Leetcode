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
class FindElements {

    void recover(TreeNode node, int n) {
        if(node == null) return;
        node.val = n;
        set.add(n);
        recover(node.left, 2 * n + 1);
        recover(node.right, 2 * n + 2);

    }
    HashSet set;
    public FindElements(TreeNode root) {
        set = new HashSet<>();
        recover(root, 0);
    }
    
    public boolean find(int target) {
        return set.contains(target);

    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
