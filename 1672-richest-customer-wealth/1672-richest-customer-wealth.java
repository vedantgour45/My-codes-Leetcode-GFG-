class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++) {
            int currSum = 0;
            for(int j=0; j<accounts[0].length; j++) {
                currSum = currSum+accounts[i][j];
            }
            if(currSum>max) {
                max = currSum;
            }
        }
        return max;
    }
}