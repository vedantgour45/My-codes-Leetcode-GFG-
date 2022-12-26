class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int count = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
            
            if(hm.containsKey(sum-k)) {
                count = count+hm.get(sum-k);
            }
            
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}

// int count = 0;
// for(int i=0; i<n; i++) {
//     int sum = 0;
//     for(int j=i; j<n; j++) {
//         sum = sum+arr[j];

//         if(sum==k) {
//             count++;
//         }
//     }
// }
// return count;