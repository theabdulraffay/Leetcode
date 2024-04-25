func compress(chars []byte) int {
    if len(chars) < 2 {
		return len(chars)
	}

	index := 0
	counter := 1

	for i := 1; i < len(chars); i++ {
		if chars[i] == chars[i-1] {
			counter++
		} else {
			chars[index] = chars[i-1]
			index++

			if counter != 1 {
				counterStr := strconv.Itoa(counter)
				for _, j := range counterStr {
					chars[index] = byte(j)
					index++
				}
			}

			counter = 1
		}
	}

	chars[index] = chars[len(chars)-1]
	index++

	if counter != 1 {
		counterStr := strconv.Itoa(counter)
		for _, j := range counterStr {
			chars[index] = byte(j)
			index++
		}
	}

	return index
    
}
