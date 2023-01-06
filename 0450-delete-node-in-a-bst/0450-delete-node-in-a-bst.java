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
    
    public TreeNode minValue(TreeNode root) {
        if(root.left == null) {
            return root;
        }
        return minValue(root.left);
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        //If root is null
        if(root == null) {
            return root;
        }
        
        //If key is smaller then root, continue the search in left subtree
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } 
        
        //If key is greater then root, continue the search in right subtree
        else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        
        //We found the element which is to be deleted
        else {
            
            //deletion is for leaf node
            if(root.left== null && root.right == null) {
                return null;
            }
            
            //Deletion is for the node which has single child
            else if(root.left== null) {
                return root.right;
            } 
            else if(root.right== null) {
                return root.left;
            }
            
            //Deletion is for the node which has two child
            else {
                TreeNode min = minValue(root.right); //find min in right subtree
                root.val = min.val;
                
                root.right = deleteNode(root.right, min.val);
            }
        }
        
        return root;
    }
}