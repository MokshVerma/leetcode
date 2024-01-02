class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()+1];
        Set<String> set = new HashSet<>(wordDict);
        dp[0] = 1;
        for(int i = 1; i<=s.length(); i++) {
            for(int j = i-1; j>=0; j--) {
                if(dp[j] == 1){
                    if(set.contains(s.substring(j, i))) {
                        dp[i] = 1;
                        break;
                    }
                }
            }
        }
        return dp[s.length()] == 1;
        
    }
}