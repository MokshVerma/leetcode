class Solution {
    public String longestPalindrome(String s) {
        int[] ans = new int[2];
        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int i=0; i<s.length(); i++) {
            dp[i][i] = true;
            ans[0] = i;
            ans[1] = i;
        }

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                dp[i-1][i] = true;
                ans[0] = i-1;
                ans[1] = i;
            }
        }
        
        for(int diff = 2; diff <= s.length(); diff++) {
            for (int i = 0; i< s.length() - diff; i++) {
                if(dp[i+1][i+diff-1] && s.charAt(i) == s.charAt(i+diff)) {
                    dp[i][i+diff] = true;
                    ans[0] = i;
                    ans[1] = i+diff;
                }
            }
        }
        return s.substring(ans[0], ans[1]+1);
    }
}