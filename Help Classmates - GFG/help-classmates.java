//{ Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 


// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) { 
	    // Your code goes here
	    //next smaller element
	    int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i=n-1; i>=0; i--) {
			while(!st.empty() && arr[i]<=st.peek()) {
				st.pop();
			}
			if(st.empty()) {
				ans[i] = -1;
			} else {
				ans[i] = st.peek();
			}
			st.push(arr[i]);
		}
	    return ans;
	} 
}
