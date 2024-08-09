class Solution {
    int[][] grid;
    boolean check(int i, int j) {
        int[] count = new int[10];
        for (int x = 0; x < 3; ++x) {
            for (int y = 0; y < 3; ++y) {
                int num = grid[i + x][j + y];
                if (num < 1 || num > 9 || count[num] > 0) return false;
                count[num]++;
            }
        }

        int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
        
        for(int x = 0; x < 3; ++x) {
            if(sum != (grid[i + x][j] + grid[i + x][j + 1] + grid[i + x][j + 2])) return false;
        }
        
        for(int y = 0; y < 3; ++y) {
            if(sum != (grid[i][j + y] + grid[i + 1][j + y] + grid[i + 2][j + y])) return false;
        }
        
        if(sum != (grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2])) return false;
        if(sum != (grid[i+2][j] + grid[i+1][j+1] + grid[i][j+2])) return false;

        return true;
        
    }
    public int numMagicSquaresInside(int[][] matrix) {
        grid = matrix;
        if(matrix.length <3 || matrix[0].length < 3) return 0;
        int count  = 0;
        for(int i = 0; i <= grid.length - 3; i++ ) {
            for(int j = 0; j <= grid[i].length - 3; j++) {
                if(check(i, j)) count++;
            }
        }
        return count;
        
    }
}
