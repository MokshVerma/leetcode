class Solution {
    public int numSquares(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=1; i*i<=n; i++) {
            if(i*i == n) {
                return 1;
            } else {
                set.add(i*i);
            }
        }
        
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            if(set.contains(i)) {
                dp[i] = 1;
            } else {
                dp[i] = n+1;
                for(int j: set) {
                    if(j < i) {
                        dp[i] = Math.min(dp[i], dp[i-j] + 1);
                    }
                }
            }
        }
        return dp[n];
    }
}