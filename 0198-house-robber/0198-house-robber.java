class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];        
        for(int i=1; i<nums.length; i++) {
            if(i>1) {
                dp[i] = Math.max(nums[i], Math.max(dp[i-1], dp[i-2] + nums[i]));
            } else {
                dp[i] = Math.max(nums[i], dp[i-1]);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}