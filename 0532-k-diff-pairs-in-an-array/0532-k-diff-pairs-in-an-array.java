class Solution {
    public int findPairs(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        int pairCount = 0;
        
        if(k==0) {
            for(int i : map.keySet()) {
                if(map.get(i) > 1) {
                    pairCount++;
                }
            }
            
        } else {
            for(int i : map.keySet()) {
                if(map.containsKey(i+k)) {
                    pairCount++;
                }
            }
        }
        
        return pairCount;
    }
}