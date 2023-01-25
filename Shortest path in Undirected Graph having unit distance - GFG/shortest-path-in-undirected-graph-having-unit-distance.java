//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    private int[] bfs(ArrayList<Integer>[] graph, int src) {
        
        int vertices = graph.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        int[] shortestPath = new int[vertices];
        Arrays.fill(shortestPath, -1);
        
        q.add(src);
        visited[src] = true;
        int level = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int temp = q.remove();
                shortestPath[temp] = level;
                for(int nbr : graph[temp]) {
                    if(visited[nbr]==false) {
                        q.add(nbr);
                        visited[nbr]=true;
                    }
                }
            }
            level++;
        }
        return shortestPath;
    }
    
    public int[] shortestPath(int[][] edgeList,int vertices,int edges, int src) {
        // Code here
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        
        for(int i=0;  i<vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] edge : edgeList) {
            int u = edge[0];
            int v = edge[1];
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        int[] ans = bfs(graph, src);
        return ans;
    }
}