func findLeastNumOfUniqueInts(arr []int, k int) int {
    freqMap := make(map[int]int)
	for _, num := range arr {
		freqMap[num]++
	}

	// Convert the map entries to a list of key-value pairs
	var freqList [][]int
	for key, value := range freqMap {
		freqList = append(freqList, []int{key, value})
	}

	// Sort the list based on the frequency of integers
	sort.Slice(freqList, func(i, j int) bool {
		return freqList[i][1] < freqList[j][1]
	})

	// Iterate through the sorted list
	for _, entry := range freqList {
		if k >= entry[1] {
			k -= entry[1]
			delete(freqMap, entry[0])
		} else {
			break
		}
	}

	// Return the number of unique integers left in the map
	return len(freqMap)
    
}
