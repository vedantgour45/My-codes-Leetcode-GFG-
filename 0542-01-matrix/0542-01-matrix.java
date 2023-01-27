class Solution {
    
    private int[] dr = {-1, 0, 1, 0};
    private int[] dc = {0, 1, 0, -1};
    
    public int[][] updateMatrix(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        boolean[][] visited = new boolean[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(mat[i][j]==0) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        int level = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int j=0; j<size; j++) {
                int[] temp = q.remove();

                int r = temp[0];
                int c = temp[1];
                mat[r][c] = level;

                for(int i=0; i<4; i++) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];

                    if(nr<0 || nr>=n || nc<0 || nc>=m) continue;

                    if(visited[nr][nc]==false) {
                        q.add(new int[]{nr, nc});
                        visited[nr][nc] = true;
                    }
                }

            }
            level++;
        }
        return mat;
    }
}