class Solution {

    public int minJumps(int[] arr) {
        
        int n = arr.length;
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for(int i=0; i<n; i++) {
            if(hm.containsKey(arr[i])) {
                List<Integer> oldList = hm.get(arr[i]);
                oldList.add(i);
                hm.put(arr[i], oldList);
            }
            else {
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                hm.put(arr[i], newList);
            }
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        int level = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int idx = q.remove();
                if(idx == n-1) return level;
                
                // 1st option --> take 1 step back
                if(idx-1>=0 && visited[idx-1] == false) {
                    q.add(idx-1);
                    visited[idx-1] = true;
                }

                // 2nd option --> take 1 step forward
                if(idx+1<n && visited[idx+1] == false) {
                    q.add(idx+1);
                    visited[idx+1] = true;
                }
                // 3rd option --> check for all the similar elements
                for(int newIdx : hm.get(arr[idx])) {
                    if(visited[newIdx] == false) {
                        q.add(newIdx);
                        visited[newIdx] = true;
                    }
                }
                hm.get(arr[idx]).clear();  // vvvvvImp
            }
            level++;
        }
        return -1;
    }
}