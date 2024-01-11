class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        
        for(int i=1; i<nums.length; i++) {
            dp[i] = 1;
            for(int j = i-1; j>=0; j--) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        max = Math.max(max, dp[nums.length-1]);
        return max;
    }
}