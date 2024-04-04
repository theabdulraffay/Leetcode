func check(board [][]byte, row, col int, target byte) bool {
    for i := 0; i < 9; i++ {
        if board[row][i] == target {
            return false
        }
        if board[i][col] == target {
            return false
        }
    }
    r := row - (row % 3)
    c := col - (col % 3)
    for i := r; i < r+3; i++ {
        for j := c; j < c+3; j++ {
            if board[i][j] == target {
                return false
            }
        }
    }
    return true
}

func solve(board [][]byte) bool {
    for i := 0; i < 9; i++ {
        for j := 0; j < 9; j++ {
            if board[i][j] == '.' {
                for k := byte('1'); k <= byte('9'); k++ {
                    if check(board, i, j, k) {
                        board[i][j] = k
                        x := solve(board)
                        if x {
                            return true
                        }
                        board[i][j] = '.'
                    }
                }
                return false
            }
        }
    }
    return true
}
