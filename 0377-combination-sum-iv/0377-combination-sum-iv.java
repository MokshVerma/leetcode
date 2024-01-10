class Solution {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);

        int[] dp = new int[target+1];
        for(int i=0; i<=target; i++) {
            for(int num: nums) {
                if(num < i) {
                    dp[i] += dp[i-num];
                } else if (num == i) {
                    dp[i] += 1;
                } else {
                    break;
                }
            }
        }
        return dp[target];    
    }
}