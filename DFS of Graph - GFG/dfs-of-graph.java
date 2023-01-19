//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public void BFS(int src, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ansList, boolean[] visited) {
        ansList.add(src);
        visited[src] = true;
        
        for(int neighbour : adj.get(src)) {
            if(visited[neighbour] == false) {
                BFS(neighbour, adj, ansList, visited);
            }
        }
    }
    
    public ArrayList<Integer> dfsOfGraph(int vertices, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ansList = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        int source = 0;
        BFS(source, adj, ansList, visited);
        
        return ansList;
    }
}