class Solution {

    private boolean dfs(int src, int dest, ArrayList<Integer>[] graph, boolean[] visited) {

        if(src == dest) return true;

        visited[src] = true;
        for(int nbr : graph[src]) {
            if(visited[nbr]==false) {
                boolean pathExists = dfs(nbr, dest, graph, visited);

                if(pathExists) return true;
            }
        }
        return false;
    }

    public boolean validPath(int vertices, int[][] edges, int src, int dest) {
        // 1. build an adjecency list / graph
        ArrayList<Integer>[] graph = new ArrayList[vertices];

        for(int i=0; i<vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        // 2. make boolean array visited
        boolean[] visited = new boolean[vertices];

        // 3. call dfs and return
        return dfs(src, dest, graph, visited);
    }
}