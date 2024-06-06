class Solution {
    int height(TreeNode root) {
        if(root == null) return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        boolean l = isBalanced(root.left);
        if(!l) {
            return false;
        }
        return isBalanced(root.right);
        
    }
}
