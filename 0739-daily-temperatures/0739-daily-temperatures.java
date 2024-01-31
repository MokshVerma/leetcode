class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] res = new int[n];
        res[n-1] = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        
        for(int i=n-2; i>=0; i--) {
            while(!stack.isEmpty() && temps[stack.peek()] <= temps[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = 0;
            } else {
                res[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }
}