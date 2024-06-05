class Solution {
    // public int deepestLeavesSum(TreeNode root) {
    //     Queue<TreeNode> que = new LinkedList<>();
    //     que.add(root);
    //     int toret = 0;
    //     while(!que.isEmpty()) {
    //         int n = que.size();
    //         int sum = 0;
    //         for(int i = 0; i < n; i++) {
    //             TreeNode te = que.poll();
    //             sum += te.val;
    //             if(te.left != null) que.add(te.left);
    //             if(te.right != null) que.add(te.right);
    //         }
    //         toret = sum;
    //     }
    //     return toret;
    // }

    int height(TreeNode root) {
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l, r) + 1;
    }

    int sum = 0;
    void sum(TreeNode root, int depth, int height) {
        if(root == null) return;
        if(depth == height) {
            sum += root.val;
        }
        sum(root.left, depth + 1, height);
        sum(root.right, depth + 1, height);
    }
    public int deepestLeavesSum(TreeNode root) {
        int n = height(root);
        sum(root, 1, n);
        return sum;
    }
}
