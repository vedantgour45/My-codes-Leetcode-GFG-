class Solution {
    public int longestOnes(int[] nums, int k) {
        //Three variables needed for our sliding window

        int start = 0;
        int count = 0;
        int res = 0;
        //iterate through the length of our array to find an update
        //our longest subarray

        for(int end = 0;end<nums.length;end++){

            //if we find a 0, we update our current
            if(nums[end]==0){
                count++;
            }

            //if we find more than 2 0's, we need to adjust window
            while(count > k){
                if(nums[start]==0){
                   count--;
                }
               start++;
            }

            //update the lenght of our subarray every iteration to
            //to find the maximum length
            res = Math.max(res, end-start+1);
         }
        return res;

    }
}