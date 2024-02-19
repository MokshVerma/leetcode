class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int mostFreq = 0;
        int left = 0, right = 0;
        int max = 0;
        
        for(right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            arr[c-'A']++;
            mostFreq = Math.max(mostFreq, arr[c-'A']);
            int x = (right-left+1) - mostFreq;
            if(x > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}