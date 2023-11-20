class Solution {
    public int longestSubarray(int[] nums) {
        int i=0, j=0;
        int max = 0;
        boolean isFlippable = true;
        while(j < nums.length) {
            if(nums[j] != 1) {
                if(isFlippable) {
                    isFlippable = false;
                    j++;
                } else {
                    if(nums[i] != 1) {
                        isFlippable = true;
                    }
                    i++;
                }
            } else {
                j++;
            }
            max = Math.max(max, j-i-1);
        }
        return max;
    }
}