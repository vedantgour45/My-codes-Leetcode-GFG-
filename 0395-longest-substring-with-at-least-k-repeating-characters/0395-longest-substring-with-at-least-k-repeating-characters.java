class Solution {
    public int longestSubstring(String s, int k) {
        
        int n = s.length();
        
        if(n == 0 || n < k) return 0;
        if(k <= 1) return n;

        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }

        int l = 0;  //index
        
        /*keep moving forward if the freq of the character 
        is greater than or equal to k*/
        while(l < n && map.get(s.charAt(l)) >= k) l++;
        
        /*if we have reached at the end of the string that means 
        every character occours atleat k times 
        and we can ditectly return l i.e. the entire length*/
        if(l >= n-1) return l; 
        int ls1 = longestSubstring(s.substring(0, l), k);
        
        /*it is possible that we encounter such characters 
        which are less than k times and we need to skip them all*/
        while(l < n && map.get(s.charAt(l)) < k) l++; 
        
        int ls2;
        if (l < n) {
            ls2 = longestSubstring(s.substring(l), k);
        } else {
            ls2 = 0;
        }
        
        return Math.max(ls1, ls2);
    }
}