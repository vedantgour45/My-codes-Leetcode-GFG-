class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
//         int leftmax = height[0];
//         int rightmax = height[n-1];
        
//         int water = 0;
        
//         int left = 1;
//         int right = n-2;
        
//         while(left <= right) {
//             if(leftmax <= rightmax){
//                 leftmax = Math.max(leftmax, height[left]);
//                 water += leftmax-height[left];
//                 left++;
//             } else {
//                 rightmax = Math.max(rightmax, height[right]);
//                 water += rightmax - height[right];
//                 right--;
//             }
//         }
//         return water;
        
        int left[] = new int[n];
        left[0] = height[0];
        for(int i=1; i<n; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }
        
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }
        
        int water = 0;
        for(int i=0; i<n; i++) {
            water = water + (Math.min(left[i], right[i])-height[i]);
        }
        return water;
    }
}