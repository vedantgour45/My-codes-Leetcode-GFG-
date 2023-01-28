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
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) {
            return false;
        }
        
        if(map.containsKey(k-root.val)) {
            return true;
        }
        map.put(root.val, 0);
        
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}