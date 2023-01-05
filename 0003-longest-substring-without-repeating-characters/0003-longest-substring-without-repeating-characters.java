class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0;
        int maxSize = 0;

        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        for (int i=0; i<s.length(); i++) {

            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxSize = Math.max(maxSize, i-j+1);
        }
        return maxSize;
        
        
    }
}