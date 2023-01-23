class Solution {
    
    public boolean dfs(int src, int dest, ArrayList<Integer>[] adjList, boolean[] visited) {
        
        if(src == dest) {
            return true;
        }
        
        visited[src] = true;
        
        for(int nbr : adjList[src]) {
            if(visited[nbr] == false) {
                //now the neighbour will check for the destination
                boolean exist = dfs(nbr, dest, adjList, visited); 
                if(exist) {
                    return true;
                } 
            }
        }
        return false;
    }
    
    public boolean validPath(int vertices, int[][] edges, int src, int dest) {
        
        // 1. create adjecency list(graph)
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        
        for(int i=0; i<vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] arr : edges) {
            int u = arr[0];
            int v = arr[1];
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        // 2. make a boolean array visited
        boolean[] visited = new boolean[vertices];
        
        // 3. call dfs
        return dfs(src, dest, graph, visited);     
    }
}