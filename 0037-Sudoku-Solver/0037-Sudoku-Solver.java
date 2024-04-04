class Solution {
    static boolean check(char[][] board, int row, int col, char target) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == target) {
                return false;
            }

            if (board[i][col] == target) {
                return false;
            }
        }
        int r = row - (row % 3);
        int c = col - (col % 3);
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == target) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (check(board, i, j, k)) {
                            board[i][j] = k;
                            boolean x = solve(board);
                            if(x) return true;
                            board[i][j] = '.';
                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);

    }
}
