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
    
    void solve(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> path) {
        if(root == null) 
            return;
        if(root.left == null && root.right == null) {
            if(targetSum == root.val) {
                path.add(root.val);
                List<Integer> temp = new ArrayList<>(path); // O(N)
                ans.add(temp);
                path.remove(path.size() - 1);
            }
            return;
        }
        path.add(root.val); // we have added => O(1)
        solve(root.left, targetSum - root.val, ans, path);
        solve(root.right, targetSum - root.val, ans, path);
        path.remove(path.size() - 1); // we must only remove => O(1)
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        solve(root, targetSum, ans, path);
        return ans;
    }
}