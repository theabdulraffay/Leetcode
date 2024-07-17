class Solution {
    List<TreeNode> res;
    HashSet<Integer> set;
    TreeNode recursion(TreeNode root) {
        if(root == null) return null;
        root.left = recursion(root.left);
        root.right = recursion(root.right);
        if(set.contains(root.val)) {
            if(root.left != null) res.add(root.left);
            if(root.right != null) res.add(root.right);
            return null;
        }
        return root;

    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res= new ArrayList<>();
        set = new HashSet<>();
        for(int i : to_delete)set.add(i);
        recursion(root);
        if(!set.contains(root.val)) res.add(root);
        return res;
        
    }
}
