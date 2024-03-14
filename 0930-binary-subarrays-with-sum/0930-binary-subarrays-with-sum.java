class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;
        int[] sumArr = new int[nums.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
            sumArr[i] = sum;
        }
        
        for(int i=0; i<nums.length; i++) {
            int target = sumArr[i] - goal;
            if(map.containsKey(target)){
                List<Integer> list = map.get(target);
                for(Integer index : list){
                    if(index == i){
                        break;
                    }
                    result++;
                }
            }
        }
        return result;
    }
}