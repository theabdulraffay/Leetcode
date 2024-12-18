class Solution {
    int[][] bol;
    int help(int x, int y, int m, int n) {
        if(x == m - 1 && y == n - 1) return 1;
        if(x == m || y == n) return 0;
        if(bol[x][y] != 0) return bol[x][y];
        return bol[x][y] = help(x + 1, y, m, n) + help(x, y + 1, m, n);
    }
    public int uniquePaths(int m, int n) {
        bol = new int[m][n];
        return help(0, 0, m , n);
        
    }
}
