class Solution {
    // public List<Integer> largestValues(TreeNode root) {
    //     List<Integer> toret = new ArrayList<>();
    //     if(root == null) return toret;

    //     Queue<TreeNode> que = new LinkedList<>();
    //     que.add(root);
    //     while(!que.isEmpty()) {
    //         int max = Integer.MIN_VALUE;
    //         int n = que.size();
    //         for(int i = 0; i < n;i++) {
    //             TreeNode te = que.poll();
    //             if(te.val > max) {
    //                 max = te.val;
    //             }
    //             if(te.left != null) que.add(te.left);
    //             if(te.right != null) que.add(te.right);
    //         }
    //         toret.add(max);
    //     }
    //     return toret;
        
    // }
    List<Integer> ans;
    public List<Integer> largestValues(TreeNode root) {
        ans = new ArrayList<>();
        helper(root, 0);
        return ans;
    }

    void helper(TreeNode root, int depth) {
        if(root == null) return;
        if(depth < ans.size()) {
            int max = Math.max(root.val, ans.get(depth));
            ans.set(depth, max);
        }
        else {
            ans.add(root.val);
        }
        helper(root.left, depth + 1);
        helper(root.right, depth + 1);
    }
}
