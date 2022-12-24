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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Template for all BFS -> Graphs
        // BFS -> Breadth First Search
        // DFS -> Depth First Search
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) 
            return ans;
        
        // 1. Start with adding the root
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(q.size() > 0) {
            // In every level perform RPA for every mode
            // remove, print, add child
            
            int size = q.size();
            
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                level.add(temp.val);
                if(temp.left != null) 
                    q.add(temp.left);
                if(temp.right != null) 
                    q.add(temp.right);
            }
            ans.add(level);
        }
        return ans;
    }
}