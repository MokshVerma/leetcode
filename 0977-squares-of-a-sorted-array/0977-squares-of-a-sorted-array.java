class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = 0;
        int index = 0;
        int[] result = new int[nums.length];
        while(right < nums.length) {
            if(nums[right] >= 0){
                break;
            }
            right++;
            left++;
        }
        left--;
        
        while(left >=0 && right < nums.length){
            if(Math.abs(nums[left]) < nums[right]){
                result[index] = nums[left] * nums[left];
                                left--;
                index++;
            } else {
                result[index] = nums[right] * nums[right];
                right++;
                index++;
            }
        }
        
        while(left >= 0) {
            result[index] = nums[left] * nums[left];
            left--;
            index++;
        }
        
        while(right < nums.length) {
            result[index] = nums[right] * nums[right];
            right++;
            index++;
        }
        return result;
    }
}