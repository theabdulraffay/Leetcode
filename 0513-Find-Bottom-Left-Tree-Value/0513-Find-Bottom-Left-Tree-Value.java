class Solution {

    // public int findBottomLeftValue(TreeNode root) {
    //     Queue<TreeNode> que = new LinkedList<>();
    //     que.add(root);
    //     int toret = 0;
    //     while(!que.isEmpty()) {
    //         TreeNode te = que.poll();
    //         toret = te.val;
    //         if(te.right != null) que.add(te.right);
    //         if(te.left != null) que.add(te.left);
    //     }
    //     return toret;
    // }

    int ans = -1;
    int depth = -1;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        return ans;   
    }
    void helper(TreeNode root, int height) {
        if(root == null) return;
        if(height > depth) {
            depth = height;
            ans = root.val;
        }

        helper(root.left, height + 1);
        helper(root.right, height + 1);
    }
}
