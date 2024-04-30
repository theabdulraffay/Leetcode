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
class BSTIterator {
    TreeNode n;
    ArrayList<Integer> list;
    int ptr;

    public BSTIterator(TreeNode root) {
        n = root;
        ptr = 0;
        list = new ArrayList<>();
        sort(root, list);
    }

    void sort(TreeNode n, ArrayList list) {
        if(n == null) return;
        sort(n.left, list);
        list.add(n.val);
        sort(n.right, list);
    }
    
    public int next() {
        return list.get(ptr++);
    }
    
    public boolean hasNext() {
        return ptr < list.size();
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
