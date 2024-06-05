class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int toret = 0;
        while(!que.isEmpty()) {
            int n = que.size();
            // List<Integer> r = new ArrayList<>();
            int sum = 0;
            for(int i = 0; i < n; i++) {
                TreeNode te = que.poll();
                // r.add(te.val);
                sum += te.val;
                if(te.left != null) que.add(te.left);
                if(te.right != null) que.add(te.right);
            }
            toret = sum;
        }
        return toret;
        
    }
}
