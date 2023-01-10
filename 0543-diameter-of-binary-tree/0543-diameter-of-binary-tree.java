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
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+ Math.max(height(root.left), height(root.right));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        //base case 
        if(root == null) {
            return 0;
        }
        
        //If diameter passes through root
        int fromRoot = height(root.left)+height(root.right);
        
        //If diameter lies in left subtree
        int leftSubtree = diameterOfBinaryTree(root.left);
            
        //If diameter lies in right subtree
        int rightSubtree = diameterOfBinaryTree(root.right);
        
        int leftOrRight = Math.max(leftSubtree, rightSubtree);
        
        return Math.max(fromRoot, leftOrRight);
    }
}