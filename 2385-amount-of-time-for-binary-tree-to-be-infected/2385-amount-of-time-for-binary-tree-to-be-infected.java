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

    TreeNode origin;
    
    public int amountOfTime(TreeNode root, int start) {
        
        if(root == null) return 0;
        origin = null;
        
        HashMap<TreeNode, TreeNode> map = new HashMap<>(); // this will store node and its parent
        
        createMap(map, root, start);
        int res = 0;
        
        //bfs
        Queue<TreeNode> q = new LinkedList<>();
        
        HashSet<TreeNode> visited = new HashSet<>(); // to keep the track of visited nodes
        
        q.add(origin);
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            
            for(int i=0; i<size; i++) {
                
                TreeNode curr = q.remove();
                visited.add(curr);
                
                if(curr.left != null && !visited.contains(curr.left))
                    q.add(curr.left);
                
                if(curr.right != null && !visited.contains(curr.right))
                    q.add(curr.right);
                
                TreeNode parent = map.getOrDefault(curr,null);
                
                if(parent != null && ! visited.contains(parent))
                    q.add(parent);
            }
            
            res++;
        }
        
        return res-1;
    }
    
    public void createMap(HashMap<TreeNode,TreeNode> map, TreeNode root, int start) {
        if(root == null) return;
        
        if(root.left != null)
            map.put(root.left, root);
        
        if(root.right != null)
            map.put(root.right, root);
        
        if(root.val == start)
            origin = root;
        
        createMap(map,root.left, start);
        createMap(map,root.right, start);
    }
}