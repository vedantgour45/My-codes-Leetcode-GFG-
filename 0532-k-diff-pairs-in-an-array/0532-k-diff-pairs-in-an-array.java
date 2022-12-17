class Solution {
    public int findPairs(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int ans = 0;
        
        if(k==0) {
            for(int key : hm.keySet()) {
                if(hm.get(key) > 1) {
                    ans++;
                }
            }
        } 
        else {
            for(int key : hm.keySet()) {
                if(hm.containsKey(key + k)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}