class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int left = 0, right = tokens.length-1;
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left];
                score++;
                left++;
            } else {
                if(score == 0){
                    return 0;
                }
                power += tokens[right];
                score--;
                right--;
            }
            maxScore = Math.max(maxScore, Math.max(score, 0));
        }
        return maxScore;
    }
}