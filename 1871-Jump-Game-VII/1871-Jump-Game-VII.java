class Solution {
    boolean helper(String s, int min, int max, int cur, Boolean[] dp) {
        if(cur == s.length() - 1) return true;
        if(cur >= s.length()) return false;
        if(dp[cur] != null) return dp[cur];
        for(int i = cur+min; i <= cur+max; i++) {
            if(helper(s, min, max, i, dp)) {
                dp[cur] = true;
                return true;
            }
        }
        dp[cur] = false;
        return false;
    }
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if(s.charAt(n - 1) == '1') return false;
        Boolean[] dp = new Boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') {
                cnt++;
                dp[i] = false;
                if(cnt >= maxJump) return false;
            } else cnt = 0;
        }
        
        return helper(s, minJump, maxJump, 0, dp);
    }
}
