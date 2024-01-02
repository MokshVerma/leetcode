class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        
        for(int i=0; i<coins.length; i++) {
            if(coins[i] >= dp.length){
                break;
            }
            dp[coins[i]] = 1;
        }
        
        for(int i=1; i<=amount; i++) {
            dp[i] = amount+1;
            for(int j = 0; j<coins.length; j++) {
                if(coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                }
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}