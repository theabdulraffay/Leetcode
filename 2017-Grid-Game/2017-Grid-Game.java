class Solution {
    public long gridGame(int[][] grid) {
        long a = 0, b = 0;
        for (int i = 0; i < grid[0].length; i++) a += grid[0][i];
        long res = Long.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            a -= grid[0][i];
            res = Math.min(res, Math.max(a, b));
            b += grid[1][i];
        }
        return res;
    }
}
