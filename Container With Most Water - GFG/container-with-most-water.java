//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    long maxArea(int arr[], int n){
        // Code Here
        int i=0;
        int j=n-1;
        
        long area = 0;
        
        while(i<j) {
            int h = Math.min(arr[i], arr[j]);
            int w = j-i;
            long currArea = h*w;
            area = Math.max(area, currArea);
            if(arr[i]<arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}