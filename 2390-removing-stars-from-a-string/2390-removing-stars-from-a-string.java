class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*') {
                str.deleteCharAt(str.length()-1);
            } else {
                str.append(c);
            }
        }
        return str.toString();

    }
}