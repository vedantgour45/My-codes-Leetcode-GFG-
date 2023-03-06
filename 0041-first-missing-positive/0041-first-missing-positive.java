class Solution {
    public int firstMissingPositive(int[] arr) {

        int n = arr.length;
        
        // mark element which are out of range and manage presence of one
        boolean one = false;
        for (int i=0; i<n; i++) {
            if(arr[i]==1) {
                one = true;
            }
            //out of range
            if(arr[i]<1 || arr[i]>n){
                arr[i]=1;
            }
        }
        if(one==false) return 1;
        
        // Map element with index
        for(int i=0; i<n; i++) {
            int idx = Math.abs(arr[i]);
            arr[idx-1] = -Math.abs(arr[idx-1]);
        }
        
        // Find the first missing positive integer
        for (int i=0; i<n; i++) {
            // if element is +ve that means index +1 is missing from array
            if(arr[i]>0){
                return i+1;
            }
        }
        return n+1; 
        
        
        // Arrays.sort(nums);
        // int missing = 1;
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i]==missing) {
        //         missing++;
        //     }
        // }
        // return missing;
        
        
        
//         int length = Integer.MAX_VALUE;
        
//         HashMap<Integer,Integer>map=new HashMap<>();
        
//         for(int i=0; i<nums.length; i++){
//             if(!map.containsKey(nums[i])){
//                 map.put(nums[i], 1);
//             }
//         }

//         for(int i=1; i<length; i++){
//             if(!map.containsKey(i)){
//                 return i;
//             }
//         }
//         return 1;
    }
}