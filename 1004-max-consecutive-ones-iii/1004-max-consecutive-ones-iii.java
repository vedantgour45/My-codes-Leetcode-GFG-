class Solution {
    public int longestOnes(int[] nums, int k) {

        //Three variables needed for our sliding window
        int start = 0;
        int count = 0;
        int ans = 0;
        
        //iterate through the length of our array
        for(int end = 0; end<nums.length; end++) {

            //if we find a 0, we update our count
            if(nums[end]==0) {
                count++;
            }

            //if we find more than k 0's, we need to adjust window
            while(count > k){
                if(nums[start]==0){
                   count--;
                }
               start++;
            }

            //update the length of subarray in every iteration to to find maximum length
            ans = Math.max(ans, end-start+1);
         }
        
        return ans;
    }
}