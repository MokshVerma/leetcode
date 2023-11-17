/** 
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
**/

class Solution {


    private boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int left = 0, right = 0;
        int vowelCount = 0;

        while(right < k) {
            if(isVowel(s.charAt(right))) {
                vowelCount++;
            }
            right++;
        }

        int maxVowels = vowelCount;
        while(right < s.length()) {
            if(isVowel(s.charAt(left++))) {
                vowelCount--;
            }


            if(isVowel(s.charAt(right++))) {
                vowelCount++;
            }

            maxVowels = Math.max(vowelCount, maxVowels);
        }
        return maxVowels;
    }
}