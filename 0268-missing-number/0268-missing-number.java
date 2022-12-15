class Solution {
    public int missingNumber(int[] nums) {
        /* 
        *****BASIC BRUTE FORCE SOLUTION ----> O(NlogN)******
        
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                ans = i;
                break;
            } else if(nums[i]==i){
                ans = nums.length;
            }
        }
        return ans;
        */
        
        /*
        ******MOST OPTIMIZED APPROACH O()*****
        
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        int naturalNoSum = (n*(n+1))/2;
        int ans = naturalNoSum-sum;
        return ans;
        */
        
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i]==0) {
                return i;
            }
        }
        return 0;
    }
}