class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        for(int i=n-1; i>0; i--) {
            stones[i-1] = stones[i]-stones[i-1];
            Arrays.sort(stones);
        }
        return stones[0];
    }
}