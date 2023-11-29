class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int left = -1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(stack.isEmpty() || c == '(' || c == s.charAt(stack.peek())) {
                left = i;
                stack.push(i);
            } else if (c == ')'){
                if(s.charAt(stack.peek()) == '(') {
                    stack.pop();


                if(stack.isEmpty()) {
                    left = -1;
                } else {
                    left = stack.peek();
                }
                max = Math.max(max, i - left);
                }
            }
        }
        return max;
    }
}