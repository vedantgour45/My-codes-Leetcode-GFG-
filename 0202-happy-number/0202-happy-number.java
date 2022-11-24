class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        
        do {
            slow = sq(slow);
            fast = sq(sq(fast));
            if(slow==1) {
                return true;
            }
        } while(slow!=fast);
        return false;
    }
    public int sq(int n) {
        int sum = 0;
        while(n!=0) {
            int digit = n%10;
            sum += (digit*digit);
            n /=10;
        }
        return sum;
    }
}