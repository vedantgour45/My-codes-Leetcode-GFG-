class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int n = word1.length();
        int m = word2. length();
        int i=0;
        int j=0;
        
        while(i<n && j<m) {
            ans = ans+word1.charAt(i);
            i++;
            ans = ans+word2.charAt(j);
            j++;
        }
        while(i<n) {
            ans = ans+word1.charAt(i);
            i++;
        }
        while(j<m) {
            ans = ans+word2.charAt(j);
            j++;
        }
        
        return ans;
    }
}