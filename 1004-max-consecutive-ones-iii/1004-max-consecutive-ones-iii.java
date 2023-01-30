class Solution {
    public int longestOnes(int[] nums, int k) {

        int start = 0;
        int count = 0;
        int ans = 0;

        for(int end = 0; end<nums.length; end++){
            
            if(nums[end]==0){
                count++;
            }

            while(count > k){
                if(nums[start]==0){
                   count--;
                }
               start++;
            }

            ans = Math.max(ans, end-start+1);
         }
        return ans;

    }
}