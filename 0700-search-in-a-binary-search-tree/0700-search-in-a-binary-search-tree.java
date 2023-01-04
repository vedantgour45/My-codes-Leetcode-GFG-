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
    public TreeNode searchBST(TreeNode root, int target) {
        
        //case 1: root is null
        if(root == null) {
            return root;
        }
        
        //case 2: root itself is the target
        if(root.val == target) {
            return root;
        }
        
        //case 3: target is less than root(search in left subtree)
        if(root.val> target) {
            return searchBST(root.left, target);
        }
        
        //case 4: target is greater than root(search in right subtree)
        return searchBST(root.right, target);
    }
}

    /*  Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            
            if(curr.left != null) {
                q.add(curr.left);
            }
            
            if(curr.right != null) {
                q.add(curr.right);
            }
            
            if(curr.val == val) {
                return curr;
            }
        }
        return null;
        
        */