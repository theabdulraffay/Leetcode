class Solution {
    static boolean check(char[][] board, int row, int col, char target) {
        int no = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == target) { no++; }
            if (board[i][col] == target) { no++; }
        }
        int r = row - (row % 3);
        int c = col - (col % 3);
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == target) { no++; }
            }
        }
        return no > 3;
    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && check(board, i, j, board[i][j])) {
                    return false;
                }
            }
        }
        return true;
        
    }
}
