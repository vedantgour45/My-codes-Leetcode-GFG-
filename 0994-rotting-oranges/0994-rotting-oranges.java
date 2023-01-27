class Solution {
    
    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};
    
    public int orangesRotting(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int freshOranges = 0;
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(grid[i][j]==2) q.add(new int[]{i, j}); // add rotten oranges to q
                else if(grid[i][j]==1) freshOranges++;  // keep counting fresh oranges
            }
        }
        
        if(freshOranges == 0) return 0;
        
        int level = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int[] temp = q.poll();
                int r = temp[0];
                int c = temp[1];
                
                for(int j=0; j<4; j++) {
                    int nr = r + dr[j];
                    int nc = c + dc[j];
                    
                    if(nr<0 || nr>=row || nc<0 || nc>=col) continue;
                    
                    if(grid[nr][nc]==1) {
                        grid[nr][nc] = 2;
                        freshOranges--;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
            level++;
        }
        
        if(freshOranges==0) return level-1;
        
        return -1;
    }
}