class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[] ans = new int[2];
        boolean[][] dp = new boolean[n][n];
        
        for(int i=0; i<n; i++) {
            dp[i][i] = true;
            ans[0] = i;
            ans[1] = i;
        }
        
        for(int i=0; i<n-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                ans[0] = i;
                ans[1] = i+1;
            }
        }
        
        for(int diff = 2; diff<=n; diff++) {
            for(int i = 0; i < n-diff; i++) {
                if(s.charAt(i) == s.charAt(i+diff) && dp[i+1][i+diff-1]) {
                    dp[i][i+diff] = true;
                    ans[0] = i;
                    ans[1] = i+diff;
                }
            }
        }
        return s.substring(ans[0], ans[1] + 1);
    }
}