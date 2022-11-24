class Solution {
    public int majorityElement(int[] nums) {
                /*int n = nums.length;
                int count = 0;
                for(int i=0; i<n; i++){
                    count = 0;
                    for(int j=0; j<n; j++){
                        if(nums[j]==nums[i]){   This is a brute force solution
                            count++;
                        }
                    }
                    if(count > (n/2)){
                        return nums[i];
                    }
                }    
                return -1; */
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}