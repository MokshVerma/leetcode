func isVowel(c string) bool {
	if c == "a" || c == "e" || c == "i" || c == "o" || c == "u" {
		return true
	}
	return false
}

func maxVowels(s string, k int) int {
	left := 0
	right := 0
	vowelCount := 0

	for right < k {
		if isVowel(string(s[right])) {
			vowelCount++
		}
		right++
	}

	maxCount := vowelCount

	for right < len(s) {
		if isVowel(string(s[left])) {
			vowelCount--
		}

		if isVowel(string(s[right])) {
			vowelCount++
		}
        
        right++
        left++

		maxCount = max(maxCount, vowelCount)
	}

	return maxCount
}