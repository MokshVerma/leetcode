/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(null == root){
            return root;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
    
        while(!queue.isEmpty()) {
            while(size > 0) {
                Node currentNode = queue.remove();
                if(null != currentNode.left) {
                    queue.add(currentNode.left);
                }
                
                if(null != currentNode.right) {
                    queue.add(currentNode.right);
                }
                
                if(size > 1){
                    currentNode.next = queue.peek();
                } else if(size == 1){
                    currentNode.next = null;
                }
                size--;
            }
            size = queue.size();
        }
        return root;
    }
}














