class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        
        if (n == 0 || k == 0) {
            return new int[0];
        }
        
        int[] result = new int[n - k + 1];
        
        Deque<Integer> deque = new ArrayDeque<>(); // to store indices of nums
        
        for (int i = 0; i < n; i++) {
            
            // remove elements from deque that are outside the window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // remove elements from deque that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            deque.offerLast(i); // add current element's index to deque
            
            // add the maximum element in the current window to result
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}