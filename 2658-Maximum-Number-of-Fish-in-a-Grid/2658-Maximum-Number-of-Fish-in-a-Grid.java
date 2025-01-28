class Solution {
    int[][] dir = {{0, 1}, {0, -1}, {1,0}, {-1,0}};
    int helper(int[][] grid, int n, int m) {
        if(grid[n][m] == 0) return 0;
        int max = grid[n][m];
        grid[n][m] = 0;
        for (int[] i : dir) {
            int nx = n + i[0];
            int ny = m + i[1];
            if(nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                max += helper(grid, nx, ny);
            }
        }
        return max;
    }
    public int findMaxFish(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, helper(grid, i, j)); 
            }
        }
        return max;

        
    }
}
