type void struct{}
var null void
func findDifference(nums1 []int, nums2 []int) [][]int {
	var ok bool
	var result [][]int
	set1 := map[int]void{}
	set2 := map[int]void{}

	for i := 0; i < len(nums1); i++ {
		set1[nums1[i]] = null
	}

	for i := 0; i < len(nums2); i++ {
		set2[nums2[i]] = null
	}

	result = append(result, []int{})

	for i := 0; i < len(nums1); i++ {
		_, ok = set2[nums1[i]]
		if !ok {
			result[0] = append(result[0], nums1[i])
			set2[nums1[i]] = null
		}
	}

	result = append(result, []int{})
	
	for i := 0; i < len(nums2); i++ {
		_, ok = set1[nums2[i]]
		if !ok {
			result[1] = append(result[1], nums2[i])
			set1[nums2[i]] = null
		}
	}
	return result
}