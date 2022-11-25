class Solution {
    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
                    
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        
        while(j<n) {
            if(nums[j]!=0) {
                swap(nums, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }
}


//      int ans[] = new int[n];
//      int idx = 0;
//      for(int i=0; i<n; i++) {
//          if(nums[i]!=0) {
//              ans[idx] = nums[i];
//              idx++;
//          }
//      }
//      for(int i=0; i<n; i++) {
//          nums[i] = ans[i];
//      }