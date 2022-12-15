//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution { 
  
// function to find the first element 
// occurring k number of times 
    static int firstElement(int arr[], int n, int k) { 
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i=0; i<n; i++) {
        //     hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            
        //     if(hm.get(arr[i])==k) {
        //         return arr[i];
        //     }
        // }
        // return -1;
        
        int freq[] = new int[10001];
        for(int i=0; i<n; i++) {
            freq[arr[i]]++;
        }
        
        for(int i=0; i<n; i++) {
            if(freq[arr[i]]==k) {
                return arr[i];
            }
        }
        return -1;
    }
}

//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] a2 = line.trim().split("\\s+");
		    int n=Integer.parseInt(a2[0]);
		    int k=Integer.parseInt(a2[1]);
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    Solution ob=new Solution();
		    int ans=ob.firstElement(a,n,k);
		    System.out.println(ans);
		    
		}
	}
}

// } Driver Code Ends