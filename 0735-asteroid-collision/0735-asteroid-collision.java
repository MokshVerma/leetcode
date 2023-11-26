class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty() || arr[i] > 0 || stack.peek() < 0) {
                stack.push(arr[i]);
            } else if(!isSameDirection(arr[i], stack.peek())) {
                if(stack.peek() <= Math.abs(arr[i])) {
                    int x = stack.pop();
                    if(x < Math.abs(arr[i])) {
                        i--;
                    }
                }
            }
        }

        int[] result = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    private boolean isSameDirection(int x, int y) {
        return (x<0 && y<0) || (x>0 && y>0);
    }
}