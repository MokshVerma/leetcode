class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int max = 0;
        while(j < nums.length) {
            if(nums[j] == 0) {
                if(k > 0) {
                    j++;
                    k--;
                } else {
                    if(nums[i] == 0) {
                        k++;
                    }
                    i++;
                }
            } else {
                j++;
            }
            max = Math.max(max, j-i);
        }

        return max;
    }
}