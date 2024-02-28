/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth = 0;
    int val = 0;
    public int findBottomLeftValue(TreeNode root) {
        val = root.val;
        rec(root, 0, 0);
        return val;
    }
    
    public void rec(TreeNode root, int pos, int depth) {
        if(root == null) {
            return;
        }
        if(maxDepth < depth){
            val = root.val;
            maxDepth = depth;
        }
        rec(root.left, pos-1, depth+1);
        rec(root.right, pos+1, depth+1);
    }
}