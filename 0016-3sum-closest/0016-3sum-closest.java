class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        
        if(closest == target) return closest;
        
        for(int i = 0; i<nums.length-2; i++) {
            
            int x = i+1;
            int y = nums.length-1;
            
            while(x < y) {
                
                int sum = nums[i]+nums[x]+nums[y];
                
                if(Math.abs(target-sum) < Math.abs(target-closest)){
                    closest = sum;
                }
                
                if(sum > target) y--;
                
                else if(sum < target) x++;
                
                else return sum;
            }
        }
        return closest;
    }
}

/*

        int closestSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    
                    if (currentSum == target) return currentSum;
                    
                    if (Math.abs(target - currentSum) <= Math.abs(target - closestSum)) {
                        closestSum = currentSum;
                    }
                }
            }
        }
        return closestSum;

*/