class Solution {
    int helper(int[] nums, int i, int c) {
        if(i == nums.length) return c;
        return helper(nums, i + 1, c ^ nums[i]) + helper(nums, i + 1, c);
    }
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
        
    }
}
