class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int missing = 1;
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i]==missing) {
        //         missing++;
        //     }
        // }
        // return missing;
        
        
        
        int length = Integer.MAX_VALUE;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
        }

        for(int i=1; i<length; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return 1;
    }
}