class Solution {
    int climbStairs(int n, int[] dp) {
        if(n == 0) return 1;
        else if(n < 0) return 0;
        else if(dp[n] != -1) return dp[n];
        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbStairs(n, dp);
        
    }
}
