//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static void dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
		visited[src] = true;

		for(int nbr=0; nbr<adj.size(); nbr++) {
			if(adj.get(src).get(nbr) == 1 && visited[nbr] == false) {
				dfs(nbr, adj, visited);
			}
		}
    }
		
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int vertices) {
        int province = 0;
		boolean[] visited = new boolean[vertices];

		for(int i=0; i<vertices; i++) {
			if(visited[i]==false) {
				dfs(i, adj, visited);
				province++;
			}
		}
		return province;
    }
};