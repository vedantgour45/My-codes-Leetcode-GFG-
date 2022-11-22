//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
        // code here
        int n = nums.length;
        int count = 0;
        for(int j=0; j<n; j++) {
            int smallElements=0;
            for(int i=0; i<j; i++) {
               if(nums[i] < nums[j]) {
                   smallElements++;
               }
            }
            int largeElements = 0;
            for(int k=j+1; k<n; k++) {
               if(nums[j] < nums[k]) {
                   largeElements++;
               }
            }
            count = count+(smallElements*largeElements);
        }
        return count;
    }
}