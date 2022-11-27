class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int leftmax = height[0];
        int rightmax = height[n-1];
        
        int water = 0;
        
        int left = 1;
        int right = n-2;
        
        while(left <= right) {
            if(leftmax <= rightmax){
                leftmax = Math.max(leftmax, height[left]);
                water += leftmax-height[left];
                left++;
            } else {
                rightmax = Math.max(rightmax, height[right]);
                water += rightmax - height[right];
                right--;
            }
        }
        return water;
    }
}