func checkIfExist(arr []int) bool {
	hashMap := make(map[int]bool)
	for _, num := range arr {
		if _, exists := hashMap[num*2]; exists {
			return true
		}

		if num%2 == 0 {
			if _, exists := hashMap[num/2]; exists {
				return true
			}
		}

		hashMap[num] = true
	}

	return false
}
