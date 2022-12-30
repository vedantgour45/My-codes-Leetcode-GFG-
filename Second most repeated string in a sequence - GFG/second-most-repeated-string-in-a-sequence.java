//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String secFrequent(String str[], int n) {
        // your code here
        HashMap<String, Integer> hm = new HashMap<>();
        
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            hm.put(str[i], hm.getOrDefault(str[i], 0)+1);
            if(hm.get(str[i]) > max) {
                max = hm.get(str[i]);
            }
        }
        //at this stage we know the max;
        String ans = "";
        
        for(HashMap.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > secMax && entry.getValue() < max) {
                secMax = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}