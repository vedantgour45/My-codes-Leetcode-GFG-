class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;
        
        // base case
        if (m*k> n) return -1;
        
        int ans=-1;

        // low is minimim from the array
        int low = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            low = Math.min(low, bloomDay[i]);
        }
        
        // high is maximum from the array
        int high = low;
        for (int i=0; i<n; i++) {
            high = Math.max(high, bloomDay[i]);
        }
        
        //binary search
        while (low <= high) {
            
            int mid = (low + high)/2; // Possible result
            
            // Check if it is possible?
            if (isPossible(bloomDay, mid, m, k)){   
                ans= mid;
                
                high= mid-1; // Lets check for a lesser possible answer
            }
            else
                low= mid+1; // Looks like we can not have m bouquets for this mid
            
        }
        return ans;
    }
    
    public boolean isPossible(int arr[], int mid, int bouquets, int k) {   
        
        int flowers=0;
        int boqs=0;

        for (int i=0; i<arr.length; i++) {
            
            if (arr[i]>mid) // Implies flower hasn't bloomed so can not be a part of subarray, so count set to 0
                flowers=0;  // Since adjacent
            
            else {          // We need to check if the number of flowers is k(indicates size of curr subarray)
                flowers++;  // Count of elements/ flowers in subarray/ bouquets (adjacent)
                
                if(flowers==k) {
                    boqs++; // Count of bouquets
                    flowers=0; 
                }
                else
                    continue;
            }
            
        }
        
        if (boqs>= bouquets) // We can make m bouquets
            return true;
        else 
            return false;
    }
}