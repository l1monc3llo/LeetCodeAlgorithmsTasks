func search(nums []int, target int) int {
	left := 0
	right := len(nums) - 1
	for left <= right {
		var mid int = left + (right-left)/2
		if nums[mid] == target {
			return mid
		} else if nums[mid] < target {
			left = mid + 1
		} else {
			right = mid - 1
		}

	}
	return -1;

}
