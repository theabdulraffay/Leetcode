func check(row, col int, grid [][]int) bool {
	for i := 0; i < len(grid); i++ {
		if grid[row][i] != grid[i][col] {
			return false
		}
	}
	return true
}

func equalPairs(grid [][]int) int {
	count := 0
	n := len(grid)

	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if grid[i][0] == grid[0][j] && check(i, j, grid) {
				count++
			}
		}
	}

	return count
}
