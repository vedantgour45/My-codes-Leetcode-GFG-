class Solution {

    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};

    private void dfs(int r, int c, char[][] grid, boolean[][] visited) {

        int row = grid.length;
        int col = grid[0].length;

        visited[r][c] = true;

        for(int i=0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr<0 || nr>=row || nc<0 || nc>=col) continue;

            if(visited[nr][nc]==false && grid[nr][nc]=='1') {
                dfs(nr, nc, grid, visited);
            }
        }
    }

    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[row][col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(visited[i][j]==false && grid[i][j]=='1') {
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
}