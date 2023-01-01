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
    public int minDepth(TreeNode root) {
        if(root == null) 
            return 0;
        
        if (root.left == null && root.right == null)
            return 1;
 
        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minDepth(root.right) + 1;
 
        // If right subtree is NULL, recur for left subtree
        if (root.right == null)
            return minDepth(root.left) + 1;
        
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        
        return 1 + Math.min(leftHeight, rightHeight);
    }
}