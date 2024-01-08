class Solution {
    
    public int getNum(int a, int b, int c) {
        if(a == b && b == c) {
            return a+1;
        } else {
            if(a > 0 && b>0 && c>0){
                return Math.min(a,Math.min(b,c)) + 1;
            }
        }
        return 1;
    }
    
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max = 0;
        if(matrix[0][0] == '1') {
            dp[0][0] = 1;
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == '1'){
                    dp[i][j] = 1;
                }
                
                if(i > 0 && j > 0 && matrix[i][j] == '1') {
                    dp[i][j] = getNum(dp[i][j-1], dp[i-1][j-1], dp[i-1][j]);
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;  
    }
}