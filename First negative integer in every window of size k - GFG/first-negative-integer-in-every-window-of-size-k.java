//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends
//User function Template for Java

class Compute {
    public long[] printFirstNegativeInteger(long arr[], int n, int k) {
        
        long[] ans = new long[n-k+1];
        Queue<Long> q = new LinkedList<>();
        
        int i=0, j=0;
        
        while(j<n) {
            
            //add the negative number to the queue
            if(arr[j]<0) q.add(arr[j]);

            //if the window is less than k --> keep moving j
            if(j-i+1 < k) j++;
            
            //if the window is equal to k calculate ans and slide the window
            else if(j-i+1 == k) {
                
                //if the queqe is not empty--> 1st element is the 1st -ve
                if(!q.isEmpty()) {
                    ans[i] = q.peek();
                    if(arr[i] == q.peek()) q.poll();
                } 
                
                //if the queue is empty then --> ans is 0;
                else {
                    ans[i] = 0;
                }
                
                //slide the window
                i++;
                j++;
            }
        }
        return ans;
    }
}

/*
for(int i=0; i<=n-k; i++) {
    for(int j=i; j<i+k; j++) {
        if(arr[j] < 0) {
            ans[i] = arr[j];
            break;
        }
    }
}
return ans;
*/