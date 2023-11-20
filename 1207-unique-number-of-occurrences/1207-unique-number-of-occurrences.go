type void struct {
}

func uniqueOccurrences(arr []int) bool {
	var m = map[int]int{}

	for i := 0; i < len(arr); i++ {
		_, isPresent := m[arr[i]]
		if isPresent {
			m[arr[i]] = m[arr[i]] + 1
		} else {
			m[arr[i]] = 1
		}
	}
	var mem = void{}
	var s = map[int]void{}

	for _, value := range m {
		_, isPresentInSet := s[value]
		if isPresentInSet {
			return false
		} else {
			s[value] = mem
		}
	}
	return true;
}