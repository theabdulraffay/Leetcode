func check(board [][]byte, row int, col int, target byte) bool {
    for i := 0; i < 9; i++ {
        if i != col  && board[row][i] == target {
            return true
        }
        
        if i != row && board[i][col] == target {
            return true
        }
    }

    st := (row/3)*3
    en := (col/3)*3
    for i := st; i < st + 3; i++ {
        for j := en; j < en + 3; j++ {
            if (i != row || j != col) && board[i][j] == target {
                return true
            }
        }
    }
    return false
} 
func isValidSudoku(board [][]byte) bool {
    for i := 0; i < 9; i++ {
        for j := 0; j < 9; j++ {
            if board[i][j] != '.' && check(board, i, j, board[i][j]) {
                return false
            }
        }
    }
    return true
    
}
