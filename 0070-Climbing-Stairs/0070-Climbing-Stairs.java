class Solution {
    public int climbStairs(int n) {
        int rr[] = new int[n + 1];
        rr[0] = 1; rr[1] = 1;
        for (int i = 2; i <= n; i++) {
            rr[i] = rr[i- 1] + rr[i - 2];
        }
        return rr[n];
    }
}
