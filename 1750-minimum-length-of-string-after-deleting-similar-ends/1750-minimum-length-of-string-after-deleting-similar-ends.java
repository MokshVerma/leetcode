class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return right-left+1;
            }
            char prev = s.charAt(left);
            while(left < right){
                if(s.charAt(++left) != prev) {
                    break;
                }
            }
            prev = s.charAt(right);
            while(left <= right){
                if(s.charAt(--right) != prev) {
                    break;
                }
            }
        }
        return right-left+1;
    }
}