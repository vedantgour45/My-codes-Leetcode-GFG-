class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];
        
        int pivot = -1;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            sum += nums[i];
            sumLeft[i] = sum;
        }
        
        sum = 0;
        
        for(int i=n-1; i>=0; i--) {
            sum += nums[i];
            sumRight[i] = sum;
        }
        
        for(int i=0; i<n; i++) {
            if(sumLeft[i] == sumRight[i]) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}