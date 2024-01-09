class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        
        if(grid[0][0] == 1) {
            return 0;
        }
        dp[0][0] = 1;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 0 && (i > 0 || j > 0)) {
                    if(i==0) {
                        dp[i][j] = dp[i][j-1];
                    } else if (j==0) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = dp[i-1][j]  + dp[i][j-1];
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
}