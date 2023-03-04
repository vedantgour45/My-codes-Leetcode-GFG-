class Solution {
    public int partitionString(String s) {
        
        int[] freq = new int[26];
        
        int res = 0;
        int last = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (freq[s.charAt(i)-'a'] >= last) {
                res++;
                last = i+1;
            }
            
            freq[s.charAt(i)-'a'] = i+1;
        }
        return res;
    }
}