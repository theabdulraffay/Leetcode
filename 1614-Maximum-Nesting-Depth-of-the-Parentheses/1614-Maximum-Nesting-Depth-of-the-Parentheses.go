func maxDepth(s string) int {
    left := 0
	right := 0
	max := 0

	for _, c := range s {
		if c == '(' {
			left++
		} else if c == ')' {
			right++
		}
		sum := left - right
		if sum > max {
			max = sum
		}
	}

	return max
    
}
