class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            currMin = Math.min(currMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - currMin);
        }
        return maxProfit;
    }
}