class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){    // common for every approach
            return false;
        }
        
        /*BASIC APPROACH ----> O(NlogN)
        
        char[]a = s.toCharArray();
        char[]b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
        */

                /* 2nd APPROACH ----> O(n)

                int freqs[] = new int[26];
                int freqt[] = new int[26];

                for(int i=0; i<s.length(); i++){
                    freqs[s.charAt(i)-'a']++;
                    freqt[t.charAt(i)-'a']++;
                }
                for(int i=0; i<26; i++){
                    if(freqs[i]!=freqt[i]){
                        return false;
                    }
                }
                return true;
                */
        
//         int freq[] = new int[26];      // most optimised approach
        
//         for(int i=0; i<s.length(); i++){
//             freq[s.charAt(i)-'a']++;
//             freq[t.charAt(i)-'a']--;
//         }
//         for(int i=0; i<26; i++){
//             if(freq[i]!=0){
//                 return false;
//             }
//         }
//         return true;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        
         for(int i=0; i<t.length(); i++) {
             hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0)-1);           
        }
        
        for(char c : hm.keySet()) {
            if(hm.get(c)<0 || hm.get(c)>0) {
                return false;
            }
        }
        return true;
    }
}