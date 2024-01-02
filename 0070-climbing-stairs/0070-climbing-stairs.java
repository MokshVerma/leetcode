class Solution {
    public int climbStairs(int n) {
        int l1 = 1, l2 = 1;
        int result = 1;
        for(int i=2; i<=n; i++) {
            result = l1 + l2;
            l1 = l2;
            l2 = result;
        }
        return result;
    }
}