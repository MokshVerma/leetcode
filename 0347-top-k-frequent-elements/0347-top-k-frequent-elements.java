class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)  + 1);
        }
        
        List<Integer>[] result = new List[nums.length];
        for(int key: map.keySet()) {
            int freq = map.get(key);
            if(result[freq-1] == null) {
                result[freq-1] = new ArrayList<>();
            }
            result[freq-1].add(key);
        }
        
        int[] res = new int[k];
        for(int i=nums.length-1; i>=0; i--) {
            if(result[i] != null) {
                for(int x: result[i]){
                    res[--k] = x;
                    if(k == 0) {
                        break;
                    }
                }
                if(k==0) {
                    break;
                }
            }
        }
        return res;
    }
}