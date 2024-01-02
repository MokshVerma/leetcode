func climbStairs(n int) int {
	var l1 int = 1
	var l2 int = 1
	var result int = 1
	for i := 2; i <= n; i++ {
		result = l1 + l2
		l1 = l2
		l2 = result
	}
	return result
}