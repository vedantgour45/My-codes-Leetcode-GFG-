class Solution {
    
    private boolean dfs(int src, ArrayList<Integer>[] graph, boolean[] visited, int[] color, int c) {
		
		visited[src] = true;
		color[src] = c;

		for(int nbr: graph[src]) {
			if(visited[nbr] == false) {
				if(!dfs(nbr, graph, visited, color, 1-c)) return false;
			}
			else if(visited[nbr] == true && color[nbr]==color[src]) return false;
		}
		return true;
	}
    
    private boolean bfs(int src, ArrayList<Integer>[] graph, boolean[] visited, int[] color) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        color[src] = 0;
        
        while(!q.isEmpty()) {
            int temp = q.remove();
            
            for(int nbr : graph[temp]) {
                if(visited[nbr] == false) {
                    q.add(nbr);
                    visited[nbr] = true;
                    color[nbr] = 1-color[temp];
                }
                else if(visited[nbr] == true && color[nbr] == color[temp]) return false;
            }
        }
        return true;
    }
    
    public boolean possibleBipartition(int vertices, int[][] dislikes) {
        
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        
        for(int i=0; i<vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] edge: dislikes) {
            int u = edge[0];
            int v = edge[1];
            
            graph[u-1].add(v-1);
            graph[v-1].add(u-1);
        }
        
        boolean[] visited = new boolean[vertices];
        int[] color = new int[vertices];
        
        for(int i=0; i<vertices; i++) {
            if(visited[i] == false) {
                //if(!bfs(i, graph, visited, color)) return false;
                if(!dfs(i, graph, visited, color, 0)) return false;
            }
        }
        return true;
    }
}