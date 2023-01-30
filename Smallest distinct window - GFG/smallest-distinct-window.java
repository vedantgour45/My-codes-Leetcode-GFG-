//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
        //count all distinct characters in the string
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i),0);
        }
        int n=str.length();
        int i=0, j=0, ans=n, count=0;
        int len=map.size();
        while(j<n){
            char ch=str.charAt(j); //convert string into characters
            if(map.get(ch)==0) count++; //if there is no element in map
            map.put(ch,map.get(ch)+1); //put the character in map
           //if count is greater than map size or 
           //if any character is occur greater than one
            while(count>=len && map.get(str.charAt(i))>1){
                map.put(str.charAt(i), map.get(str.charAt(i))-1);
                i++;
            }
            if(count==len) //map size equal to count
            ans=Math.min(ans, j-i+1); //find min length
            j++;
        }
        return ans;

    }
}