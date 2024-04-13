func permute(nums []int, start int) {
	if start < len(nums) {
		temp := nums[start]
		r := nums[temp]
		permute(nums, start+1)
		nums[start] = r
	}
}

func buildArray(nums []int) []int {
	permute(nums, 0)
	return nums
}
