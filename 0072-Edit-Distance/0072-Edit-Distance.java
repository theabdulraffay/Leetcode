class Solution {
    int[][] dp;
    int helper(int n, int m, String w1, String w2) {
        if (n < 0) return m + 1;
        if (m < 0) return n + 1;
        if(dp[n][m] != 0)return dp[n][m];

        if (w1.charAt(n) == w2.charAt(m)) return helper(n - 1, m - 1, w1, w2);
        int insertion = 1 + helper(n, m - 1, w1, w2);
        int deletion = 1 + helper(n - 1, m, w1, w2);
        int replace = 1 + helper(n - 1, m - 1, w1, w2);
        return dp[n][m] = Math.min(insertion, Math.min(deletion, replace)); 
    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new int[n][m];

        return helper(n - 1, m - 1, word1, word2);
    }
}
