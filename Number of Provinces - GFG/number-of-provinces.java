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
    
    static void DFS(int src, ArrayList<ArrayList<Integer>> adjList, boolean visited[]) {
        visited[src] = true;
        
        for(int n : adjList.get(src)) {
            if(visited[n] == false){
                DFS(n, adjList, visited);
            }
        }
    }
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int vertices) {
        // code here
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<vertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        
        // given input is a list of list i.e. 2D array
        // we need to change it into adjecency list;
        
        for(int i=0; i<vertices; i++) {
            for(int j=0; j<vertices; j++) {
                if(adj.get(i).get(j)==1 && i!=j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        
        boolean visited[] = new boolean[vertices];
        int count = 0;
        
        for(int i=0; i<vertices; i++) {
            if(visited[i] == false) {
                count++;
                DFS(i, adjList, visited);
            }
        }
        return count;
    }
};