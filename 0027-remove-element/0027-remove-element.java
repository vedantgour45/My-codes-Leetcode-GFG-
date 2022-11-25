class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
//         int i=0;
//         int j=0;
        
//         while(j<n) {
//             if(nums[j]!=val) {
//                 swap(nums, i, j);
//                 i++;
//                 j++;
//             } else {
//                 j++;
//             }
//         }
        
//         int count =0;
//         for(int k=0; k<n; k++) {
//             if(nums[k]!=val) {
//                 count++;
//             }
//         }
//         return count;
//     }
    
//     public void swap(int nums[], int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
        
        int idx = 0;    
        for(int i = 0; i < n; i++){
           if(nums[i] != val){
               nums[idx++] = nums[i];
           }
        }
   
        return idx;
    }
}