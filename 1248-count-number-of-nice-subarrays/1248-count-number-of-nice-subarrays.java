class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int  n =nums.length;
        // replace all the odd numbers with 1
        // and all the even numbers with 0
        for(int i=0; i<n; i++){
            if(nums[i]%2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
       HashMap<Integer, Integer> hm = new HashMap<>();
        
        int sum = 0;
        int ans = 0;
        for(int i: nums){
            sum+=i;
            
            // If sum is equal to k
            if(sum==k) ans++;
            
            // sum exceeds k find number of subarrays having this sum and exclude
            // those subarrays from sum by increasing count by same amount.
            if (hm.containsKey(sum - k))
                ans+=(hm.get(sum - k));
 
            // Increment Sum count
            hm.put(sum,hm.getOrDefault(sum, 0) +1);

        }
        return ans;
    }
}