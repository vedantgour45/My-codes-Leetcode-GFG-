class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int idx = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]!=0) {
                ans[idx] = nums[i];
                idx++;
            }
        }
        for(int i=0; i<n; i++) {
            nums[i] = ans[i];
        }
    }
}