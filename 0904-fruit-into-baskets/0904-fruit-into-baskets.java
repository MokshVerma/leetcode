class Solution {
    public int totalFruit(int[] arr) {
        int max = 0, start = 0;
        int sum = 0, distinctCount = 0;
        // int[] dp = new int[26];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            sum++;
            // dp[arr[i]-'A']++;
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) == 1){
                distinctCount++;
            }

            while(distinctCount > 2){
                map.put(arr[start], map.get(arr[start]) - 1);;
                if(map.get(arr[start]) == 0){
                    distinctCount--;
                }
                sum--;
                start++;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}