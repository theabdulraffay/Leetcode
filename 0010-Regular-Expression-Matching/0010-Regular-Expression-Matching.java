class Solution {
    Boolean[][] dp;
    
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return fina(0, 0, s, p);
    }
    
    boolean fina(int i, int j, String s, String p) {
        if (j == p.length()) {
            return i == s.length();
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        boolean ans;
        boolean currentMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
        
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            ans = fina(i, j + 2, s, p) || (currentMatch && fina(i + 1, j, s, p));
        } else {
            ans = currentMatch && fina(i + 1, j + 1, s, p);
        }
        
        dp[i][j] = ans;
        return ans;
    }
}
