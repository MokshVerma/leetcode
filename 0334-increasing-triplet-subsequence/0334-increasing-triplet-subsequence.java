class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        Integer x = nums[0], y = null;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] < x) {
                x = nums[i];
            } else if(nums[i] > x && (null == y || nums[i] < y)) {
                y = nums[i];
            } else if(null != y && nums[i] > x && nums[i] > y){
                return true;
            }
        }
        return false;
    }
}