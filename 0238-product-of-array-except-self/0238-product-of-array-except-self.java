class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];

        dp[0] = 1;
        for(int i=1; i<n; i++) {
            dp[i] = dp[i-1] * nums[i-1];
        }

        int temp = nums[n-1];
        for(int i=n-2; i>=0; i--) {
            dp[i] = dp[i] * temp;
            temp = temp * nums[i];
        }
        return dp;
    }
}