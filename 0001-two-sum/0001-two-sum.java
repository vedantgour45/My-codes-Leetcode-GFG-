class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int []ans = new int[2];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            
            if(hm.containsKey(target-nums[i])) {
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            
            hm.put(nums[i], i);
        }
        
        return ans;
        
        
        
        
        
        
        
        // int i = 0; 
        // int j = n-1;

        // while(i<j) {
        //    if(nums[i]+nums[j]>target){
        //        j--;
        //    } else if(nums[i]+nums[j]<target) {
        //        i++;
        //    } else {
        //        ans[0] = i;
        //        ans[1] = j;
        //        break;
        //    }
        // }

        // return ans;
            
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(nums[i]+nums[j]==target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        // return ans;
    }
}