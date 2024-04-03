func helper(board [][]byte, i, j, index int, word string) bool {
	if index == len(word) {
		return true
	}
	if i < 0 || i >= len(board) || j < 0 || j >= len(board[0]) ||
		board[i][j] == '*' || board[i][j] != word[index] {
		return false
	}
	temp := board[i][j]
	board[i][j] = '*'
	if helper(board, i+1, j, index+1, word) ||
		helper(board, i-1, j, index+1, word) ||
		helper(board, i, j+1, index+1, word) ||
		helper(board, i, j-1, index+1, word) {
		return true
	}
	board[i][j] = temp
	return false
}

func exist(board [][]byte, word string) bool {
	for i := 0; i < len(board); i++ {
		for j := 0; j < len(board[0]); j++ {
			if board[i][j] == word[0] {
				if helper(board, i, j, 0, word) {
					return true
				}
			}
		}
	}
	return false
}
