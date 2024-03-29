class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int satisfy = 0;
        
        for(int i=0; i<grumpy.length; i++) {
            if(grumpy[i]==0) 
                satisfy += customers[i]; // directly sum the satisfy customers
            
            customers[i] = grumpy[i]*customers[i]; // collect the unsatisfy customers
        }
    
        return satisfy + getMax(customers, minutes);
    }
    
    public int getMax(int[] arr, int k){ // k is window size
        
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            
            sum += arr[i];
            if(i>=k){
                sum -= arr[i-k]; 
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}