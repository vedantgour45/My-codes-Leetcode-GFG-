//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String p, String s) {
        // code here
        
        if(s.length()<p.length()) return 0;
        
        //frequency array
        int[] sChar = new int[26];
        int[] pChar = new int[26];
        
        //increase freq
        for(int i=0; i<p.length(); i++) {
            sChar[s.charAt(i)-'a']++;
            pChar[p.charAt(i)-'a']++;
        }
        int count = 0;
        
        int start = 0;
        int end = p.length();
        
        //if both arrays are same then it is an anagram
        if(Arrays.equals(sChar, pChar)) {
            count++;
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
                count++;
            }
        }
        
        return count;
    }
}