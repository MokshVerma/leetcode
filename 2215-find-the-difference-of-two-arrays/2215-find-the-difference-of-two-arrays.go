func findDifference(nums1 []int, nums2 []int) [][]int {
	var result [][]int
    set1 := map[int]bool{}
    set2 := map[int]bool{}

	for i := 0; i < len(nums1); i++ {
		set1[nums1[i]] = true
	}

	for i := 0; i < len(nums2); i++ {
		set2[nums2[i]] = true
	}

	result = append(result, []int{})

	for i := 0; i < len(nums1); i++ {
		if !set2[nums1[i]] {
			result[0] = append(result[0], nums1[i])
			set2[nums1[i]] = true
		}
	}

	result = append(result, []int{})
	
	for i := 0; i < len(nums2); i++ {
		if !set1[nums2[i]] {
			result[1] = append(result[1], nums2[i])
			set1[nums2[i]] = true
		}
	}
	return result
}