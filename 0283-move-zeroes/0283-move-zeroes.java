class Solution {
    public void moveZeroes(int[] nums) {
        int zPtr = 0, ptr = 0;
        while(ptr < nums.length) {
            if(nums[ptr] != 0) {
                nums[zPtr++] = nums[ptr];
            }
            ptr++;
        }

        while(zPtr < nums.length) {
            nums[zPtr++] = 0;
        }
    }
}