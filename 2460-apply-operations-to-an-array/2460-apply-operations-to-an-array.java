class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            if(nums[i]==nums[i+1]) {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        
        int p1 = 0;
        int p2 = 0;
        
        while(p2<n) {
            if(nums[p2]!=0) {
                swap(nums, p1, p2);
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return nums;
    }
    
    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}