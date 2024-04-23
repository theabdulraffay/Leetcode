func frequencySort(s string) string {
    freqMap := make(map[rune]int)
	for _, ch := range s {
		freqMap[ch]++
	}

	// Convert the map entries to a list of key-value pairs
	var freqList []struct {
		Key   rune
		Value int
	}
	for key, value := range freqMap {
		freqList = append(freqList, struct {
			Key   rune
			Value int
		}{key, value})
	}

	// Sort the list based on the frequency of characters
	sort.Slice(freqList, func(i, j int) bool {
		return freqList[i].Value > freqList[j].Value
	})

	// Build the sorted string
	var str string
	for _, entry := range freqList {
		for j := 0; j < entry.Value; j++ {
			str += string(entry.Key)
		}
	}

	return str
    
}
