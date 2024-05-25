class Solution {
    int helper(TreeNode root, int target, List<Integer> list) {
        if(root == null) return 0;
        list.add(root.val);
        long sum = 0;
        int tsum = 0;
        for (int i = list.size()  - 1; i >= 0; i--) {
            sum += (long)list.get(i);
            if(sum == target) {
                tsum++;
            }
        }

        tsum += helper(root.left, target, list);
        tsum += helper(root.right, target, list);

        list.remove(list.size() - 1);
        return tsum;
    }
    public int pathSum(TreeNode root, int targetSum) {
        List<Integer> l = new ArrayList<>();
        return helper(root, targetSum, l);
        
    }
}
