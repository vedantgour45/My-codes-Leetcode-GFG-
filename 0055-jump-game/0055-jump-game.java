class Solution {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int idx = q.remove();
                if(idx == n-1) return true;
                
                for(int jump=1; jump<=arr[idx]; jump++) {
                    
                    if(idx+jump >= n) break;
                    
                    if(visited[idx+jump] == false) {
                        q.add(idx+jump);
                        visited[idx+jump] = true;
                    } 
                }
            }
        }
        return false;
    }
}