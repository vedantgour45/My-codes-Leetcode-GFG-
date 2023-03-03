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
class Solution {  // TC & SC --> O(n)
    
    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        oneWaySum(root);
        return res;
    }
    
    public int oneWaySum(TreeNode node) {
        
        if(node == null) return 0;
        
        int leftPath = oneWaySum(node.left);
        int rightPath = oneWaySum(node.right);
        
        res = Math.max(res, node.val + leftPath + rightPath);
        
        return Math.max(node.val + Math.max(leftPath, rightPath), 0);
        //If both left and right subtrees have negative maximum sums, then the function returns 0 since it's better to not include that node in the path.
    } 
}






