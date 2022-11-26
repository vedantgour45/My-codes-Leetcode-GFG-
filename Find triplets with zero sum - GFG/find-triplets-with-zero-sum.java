//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution {
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n) {
        //add code here.
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            int p1 = i+1;
            int p2 = n-1;
            while(p1<p2) {
                int sum = arr[i]+arr[p1]+arr[p2];
                if(sum==0) {
                    return true;
                } else if(sum<0) {
                    p1++;
                } else {
                    p2--;
                }
            }
        }
        return false;
    }
}