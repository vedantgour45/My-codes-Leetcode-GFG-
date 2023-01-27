class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int idx = q.remove();
                if(arr[idx] == 0) return true;
                
                // 1st option --> take 1 step back
                if(idx-arr[idx]>=0 && visited[idx-arr[idx]] == false) {
                    q.add(idx-arr[idx]);
                    visited[idx-arr[idx]] = true;
                }

                // 2nd option --> take 1 step forward
                if(idx+arr[idx]<n && visited[idx+arr[idx]] == false) {
                    q.add(idx+arr[idx]);
                    visited[idx+arr[idx]] = true;
                }
            }
        }
        return false;
    }
}