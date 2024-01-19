class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0] = grid[0];
        int min = Integer.MAX_VALUE;

        if(n==1){
            for(int i=0; i<m; i++) {
                min = Math.min(min, grid[0][i]);
            }
        }

        for(int i=1; i<n; i++) {
            for(int j=0; j<m; j++) {
                dp[i][j] = dp[i-1][j] + grid[i][j];
                if(j > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1] + grid[i][j]);
                }

                if (j<m-1){
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j+1] + grid[i][j]);
                }
                
                if(i == n-1) {
                    min = Math.min(min, dp[i][j]);
                }
            }
        }
        
        return min;
    }
}