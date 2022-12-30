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
    
    int depthA = -1, depthB = -1;
    int parentA = -1, parentB = -1;
 
    private void solve(int parent, TreeNode root, int A, int B, int depth) {
 
        if(root == null) return;
 
        if(root.val == A) {
            depthA = depth;
            parentA = parent;
            return;
        }
 
        if(root.val == B) {
            depthB = depth;
            parentB = parent;
            return;
        }
 
        solve(root.val, root.left, A, B, depth + 1);
        solve(root.val, root.right, A, B, depth + 1);
    }

    public boolean isCousins(TreeNode root, int A, int B) {
        solve(-1, root, A, B, 0);
        return (depthA == depthB) && (parentA != parentB);
    }
}