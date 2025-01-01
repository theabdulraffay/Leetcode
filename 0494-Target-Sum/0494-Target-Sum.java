class Solution {
    int[][] dp;
    public int helper(int[] nums, int target, int index) {
        if(index == nums.length) return target == 0 ? 1 : 0;
        if(dp[index][target+1000]!=-1)
            return dp[index][target+1000];
        int n = helper(nums, target + nums[index], index + 1);
        int m = helper(nums, target - nums[index], index + 1);
        return dp[index][target+1000] = n + m;
    }
  
    public int findTargetSumWays(int[] nums, int target) {
        dp = new int[nums.length][target+2002];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, target, 0);
    }
}
