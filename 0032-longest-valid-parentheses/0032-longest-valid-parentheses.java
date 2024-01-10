class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int left = -1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(i);
            } else if (stack.isEmpty()) {
                stack.push(i);
                left = i;
            } else {
                if (!stack.isEmpty() && stack.peek() != left) {
                    stack.pop();
                } else {
                    stack.push(i);
                    left = i;
                }
            }

            if(stack.isEmpty()) {
                max = Math.max(max, i - left);
            }
        }

        int right = s.length();
        while(!stack.isEmpty()) {
            max = Math.max(max, right - stack.peek() - 1);
            right = stack.pop();
        }
        max = Math.max(right, max);
        return max;
    }
}