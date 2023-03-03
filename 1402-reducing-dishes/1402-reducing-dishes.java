class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        
        Arrays.sort(satisfaction);
        
        int res = 0;
        int total = 0;
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