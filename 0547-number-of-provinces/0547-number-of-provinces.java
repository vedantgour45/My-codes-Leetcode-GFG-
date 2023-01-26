class Solution {
    
    public static void DFS(int src, ArrayList<Integer>[] adjList, boolean visited[]) {
        
        visited[src] = true;
        
        for(int nbr : adjList[src]) {
            if(visited[nbr] == false){
                DFS(nbr, adjList, visited);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int vertices = isConnected.length; 
        ArrayList<Integer>[] adjList = new ArrayList[vertices];
        
        for(int i=0; i<vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        // given input is a list of list i.e. 2D array
        // we need to change it into adjecency list;
        
        for(int i=0; i<vertices; i++) {
            for(int j=0; j<vertices; j++) {
                if(isConnected[i][j]==1 && i!=j) {
                    adjList[i].add(j);
                    adjList[j].add(i);
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
}