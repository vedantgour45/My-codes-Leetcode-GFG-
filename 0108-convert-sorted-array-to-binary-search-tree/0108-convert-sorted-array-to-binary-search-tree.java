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
    
    private TreeNode convert(int[] nums, int low, int high, TreeNode root) {
        
        if(low > high) {
            return root;
        }
 
        int mid = (low + high)/2;
        
        root = new TreeNode(nums[mid]);
 
        root.left = convert(nums, low, mid-1, root.left);
        root.right = convert(nums, mid+1, high, root.right);
 
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return convert(nums, 0, nums.length-1, null);
    }
}