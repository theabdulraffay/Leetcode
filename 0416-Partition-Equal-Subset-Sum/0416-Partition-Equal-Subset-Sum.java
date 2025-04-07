class Solution {
    Boolean[][] dp;
    boolean helper(int[] nums, int i, int c) {
        if(c <= 0) return c == 0;
        if(i == nums.length) return false;
        if(dp[c][i] != null) return dp[c][i];
        dp[c][i] = helper(nums, i + 1, c - nums[i]);
        if(dp[c][i]) return true;
        return dp[c][i] = helper(nums, i + 1, c);
    }
    public boolean canPartition(int[] nums) {
        int c = 0;
        for(int i : nums) c += i;
        if((c & 1) != 0) return false;
        dp = new Boolean[c/2 + 1][nums.length + 1];
        return helper(nums, 0, c/2);
        // return true;
        
    }
}
