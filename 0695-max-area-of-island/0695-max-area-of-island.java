class Solution {
    
    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};

    private int dfs(int r, int c, int[][] grid, boolean[][] visited) {

        int row = grid.length;
        int col = grid[0].length;

        visited[r][c] = true;
        int count1 = 1;

        for(int i=0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr<0 || nr>=row || nc<0 || nc>=col) continue;

            if(visited[nr][nc]==false && grid[nr][nc]==1) {
                count1 = count1 + dfs(nr, nc, grid, visited);
            }
        }
        return count1;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int maxArea = 0;

        boolean[][] visited = new boolean[row][col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(visited[i][j]==false && grid[i][j]==1) {
                    int area = dfs(i, j, grid, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}