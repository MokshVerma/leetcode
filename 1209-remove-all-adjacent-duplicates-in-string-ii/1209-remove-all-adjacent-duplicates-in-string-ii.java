class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Integer> freqStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(charStack.isEmpty() || charStack.peek() == c){
                count++;
                charStack.add(c);
            } else {
                if(count >= k){
                    int t = count - (count%k);
                    count = count%k;
                    while(t-- > 0){
                        charStack.pop();
                    }
                }
                if(!charStack.isEmpty() && charStack.peek() == c) {
                    count = freqStack.pop() + 1;
                } else {
                    if (count > 0) freqStack.push(count);
                    count = 1;
                }
                charStack.add(c);
            }
        }

        if(count >= k){
            int t = count - (count%k);
            while(t-- > 0){
                charStack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while(!charStack.isEmpty()) {
            str.append(charStack.pop());
        }

        return str.toString();
    }
}