class Solution {
    public int maxOperations(int[] nums, int k) {
        //Takes Time O(nlog n)
        Arrays.sort(nums);

        int i=0, j=nums.length-1, count = 0;
        while(i<j) {
            if(nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if(k > nums[i] + nums[j]) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}