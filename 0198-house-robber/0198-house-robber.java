class Solution {
public int rob(int[] nums) {
	int n = nums.length;
	int[] dp = new int[n];
	dp[0] = nums[0];
	int max = dp[0];

	for(int i=1; i<n; i++) {
        if(i > 1){
            dp[i] = Math.max(nums[i], Math.max(nums[i] + dp[i-2], dp[i-1]));
        } else {
            dp[i] = Math.max(nums[i], dp[i-1]);
        }
        max = Math.max(dp[i], max);
	}
	return max;
}
}