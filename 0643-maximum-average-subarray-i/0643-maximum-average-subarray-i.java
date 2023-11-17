class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0, j = 0;
        long sum = 0L;
        long maxAvg = Long.MIN_VALUE;
        while(j < k) {
            sum += nums[j];
            j++;
        }
        maxAvg = Math.max(sum, maxAvg);

        while(j < nums.length) {
            sum = sum - nums[i++] + nums[j++];
            maxAvg = Math.max(sum, maxAvg);
        }
        System.out.println(maxAvg);
        return maxAvg/(double)k;
    }
}