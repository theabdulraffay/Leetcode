func permutearr(list *[][]int, temp []int, nums []int) {
	if len(temp) == len(nums) {
		newTemp := make([]int, len(temp))
		copy(newTemp, temp)
		*list = append(*list, newTemp)
		return
	}
	for i := 0; i < len(nums); i++ {
		if contains(temp, nums[i]) {
			continue
		}
		temp = append(temp, nums[i])
		permutearr(list, temp, nums)
		temp = temp[:len(temp)-1]
	}
}

func contains(arr []int, target int) bool {
	for _, val := range arr {
		if val == target {
			return true
		}
	}
	return false
}

func permute(nums []int) [][]int {
	var result [][]int
	permutearr(&result, []int{}, nums)
	return result
}
