class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.peek()!=-1 && c == ')' && s.charAt(stack.peek()) == '('){
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        
        int right = s.length(), max = 0;
        while(!stack.isEmpty()){
            int left = stack.pop();
            max = Math.max(max, right-left-1);
            right = left;
        }
        return max;
    }
}