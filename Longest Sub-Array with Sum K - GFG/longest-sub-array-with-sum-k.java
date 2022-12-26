//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends
//User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        // 1. sum = 0, traverse the array
        // 2. Add each number to the sum
        // 3. If sum ==k, ans = i + 1
        // 4. sum has crossed the value 'k', now we need to check if sum - k is
        // there in the HashMap or not
        // ans = Math.max (ans, length of subarray that has sum k)
        
        int sum = 0;
        int ans = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        //1
        for(int i=0; i<n; i++) {
            //2
            sum = sum + arr[i];
            
            //3
            if(sum == k) {
                ans = i+1;
            }
            //if sum is not already present in hm then add it.
            if(!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
            //4 ifsum has crossed the value of k
            if(hm.containsKey(sum-k)) {
                ans = Math.max(ans, i-hm.get(sum-k));
            }
        }
        return ans;
    }
}


