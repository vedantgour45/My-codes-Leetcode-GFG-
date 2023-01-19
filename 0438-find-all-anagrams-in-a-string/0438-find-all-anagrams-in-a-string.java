class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        
        if(s.length()<p.length()) return ans;
        
        //frequency array
        int[] sChar = new int[26];
        int[] pChar = new int[26];
        
        //increase freq
        for(int i=0; i<p.length(); i++) {
            sChar[s.charAt(i)-'a']++;
            pChar[p.charAt(i)-'a']++;
        }
        
        int start = 0;
        int end = p.length();
        
        //if both arrays are same then it is an anagram
        if(Arrays.equals(sChar, pChar)) {
            ans.add(start);
        }
        
        while(end < s.length()) {
            //to slide the window we need to increase freq of end & decrease freq of start in string s;
            sChar[s.charAt(end)-'a']++;
            sChar[s.charAt(start)-'a']--;
            
            //slide the window
            start++;
            end++;
            
            //if both arrays are same then it is an anagram
            if(Arrays.equals(sChar, pChar)) {
                ans.add(start);
            }
        }
        
        return ans;
    }
}