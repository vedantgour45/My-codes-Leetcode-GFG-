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

//Preorder  ---> ROOT-->LEFT-->RIGHT

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    
    public void preorder(TreeNode root) {
        
        if(root == null) {
            return;
        }
 
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
 
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
}