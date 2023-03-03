class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        
        Arrays.sort(satisfaction);
        
        int res = 0;
        int total = 0; //total keeps track of the total satisfaction obtained so far
        int n = satisfaction.length;
        
        for (int i=n-1; i>=0; i--) {
            if(satisfaction[i] > -total) {
                total += satisfaction[i];
                res += total;
            }
        }
        return res;
    }
}

/*

since we are iterating through the satisfaction array in reverse order, we need to check if satisfaction[i] - total is greater than zero, which is why we check if satisfaction[i] > -total.

*/