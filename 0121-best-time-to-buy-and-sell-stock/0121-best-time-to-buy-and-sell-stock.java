class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i]-minPrice);
        }
        return profit;
    }
}