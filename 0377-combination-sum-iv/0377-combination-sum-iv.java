class Solution {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        Set<Integer> set = new LinkedHashSet<>();
        for(int num: nums) {
            set.add(num);
        }

        int[] dp = new int[target+1];
        for(int i=0; i<=target; i++) {
            for(int num: set) {
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