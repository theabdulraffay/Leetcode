class Solution {
    boolean helper(char[][] board, int i, int j, String word, int index) {
        if (index == word.length())
            return true;
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 ||
                board[i][j] == '*' || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        if (helper(board, i + 1, j, word, index + 1) ||
            helper(board, i - 1, j, word, index + 1) ||
            helper(board, i, j + 1, word, index + 1) ||
            helper(board, i, j - 1, word, index + 1)) {
                return true;
        }

        board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        boolean result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = helper(board, i, j, word, 0);
                    if (result)
                        return true;
                }
            }
        }
        return false;
    }
}
