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
    
    private boolean checkBST(TreeNode root, Long min, Long max) {
        
        if(root == null) return true;
        
        long nodeValue = root.val;
        
        if(nodeValue >= min && nodeValue <= max) {
            if(checkBST(root.left, min, nodeValue-1) && checkBST(root.right, nodeValue+1, max)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public boolean isValidBST(TreeNode root) {
        // code here
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
}