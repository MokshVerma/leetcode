class Solution {
    
    private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
            || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    private int countVowels(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    
    public boolean halvesAreAlike(String s) {
        return countVowels(s.substring(0, s.length()/2)) == countVowels(s.substring(s.length()/2, s.length()));
        
    }
}