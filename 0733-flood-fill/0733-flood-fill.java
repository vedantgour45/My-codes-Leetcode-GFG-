class Solution {
    
    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};
    
    private void dfs(int[][] image, int r, int c, int newColor, boolean[][] visited) {
        
        visited[r][c] = true;
        int originalColor = image[r][c];
        image[r][c] = newColor;
        
        int row = image.length;
        int col = image[0].length;
        
        for(int i=0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if(nr<0 || nr>=row || nc<0 || nc>=col) continue;
            
            if(visited[nr][nc] == false && image[nr][nc]==originalColor) {
                dfs(image, nr, nc, newColor, visited);
            }
        }
    }
    
    public int[][] floodFill(int[][] image, int r, int c, int newColor) {
        
        int row = image.length;
        int col = image[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        dfs(image, r, c, newColor, visited);
        return image;
    }
}