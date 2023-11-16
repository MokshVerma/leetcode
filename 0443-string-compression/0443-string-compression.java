class Solution {
    public int compress(char[] chars) {
        int ptr = 0;
        char c = chars[0];
        int count = 1;
        for(int i=1; i<chars.length; i++) {
            if(chars[i] != c){
                chars[ptr++] = c;
                if(count > 1){
                    for(char x: Integer.toString(count).toCharArray()){
                        chars[ptr++] = x;
                    }
                }
                c = chars[i];
                count = 1;
            } else {
                count++;
            }
        }
        
        chars[ptr++] = c;
        if(count > 1){
            for(char x: Integer.toString(count).toCharArray()){
                chars[ptr++] = x;
            }
        }
        return ptr;
    }
}