class Solution {
    public int trap(int[] height) {

        int n = height.length;
        
        int[] leftMax = new int[n]; // stores the maximum height on the left of each bar
        int[] rightMax = new int[n]; // stores the maximum height on the right of each bar
        
        // find the maximum height on the left of each bar
        int max = 0;
        for (int i=0; i<n; i++) {
            leftMax[i] = max;
            max = Math.max(max, height[i]);
        }
        
        // find the maximum height on the right of each bar
        max = 0;
        for (int i=n-1; i>=0; i--) {
            rightMax[i] = max;
            max = Math.max(max, height[i]);
        }
        
        // calculate the amount of water trapped at each bar
        int water = 0;
        for (int i=0; i<n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (height[i] < minHeight) {
                water += minHeight - height[i];
            }
        }
        return water;
    }
}


//          int n = height.length;   
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


        
//         int left[] = new int[n];
//         left[0] = height[0];
//         for(int i=1; i<n; i++) {
//             left[i] = Math.max(left[i-1], height[i]);
//         }
        
//         int right[] = new int[n];
//         right[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             right[i] = Math.max(right[i+1], height[i]);
//         }
        
//         int water = 0;
//         for(int i=0; i<n; i++) {
//             water = water + (Math.min(left[i], right[i])-height[i]);
//         }
//         return water;