//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    
    private int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    private int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};

    private void dfs(int r, int c, char[][] grid, boolean[][] visited) {

        int row = grid.length;
        int col = grid[0].length;

        visited[r][c] = true;

        for(int i=0; i<8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr<0 || nr>=row || nc<0 || nc>=col) continue;

            if(visited[nr][nc]==false && grid[nr][nc]=='1') {
                dfs(nr, nc, grid, visited);
            }
        }
    }
    
    public void bfs(int row, int col, char[][] grid, boolean[][] visited) {
        visited[row][col] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()) {
            int[] temp = q.remove();
            int ro = temp[0];
            int co = temp[1];
            
            for(int i=-1; i<=1; i++) {
                for(int j=-1; j<=1; j++) {
                    int newRow = ro + i;
                    int newCol = co + j;
                    
                    if(newRow < 0 || newRow >= n || newCol < 0 || newCol >= m) continue;
                    
	                if(visited[newRow][newCol] == false && grid[newRow][newCol] == '1') {
	                    visited[newRow][newCol] = true;
	                    q.add(new int[]{newRow, newCol});
	                }
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        
        boolean[][] visited = new boolean[n][m];
        int island = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(visited[i][j] == false && grid[i][j] == '1') {
                    island++;
                    //bfs(i, j, grid, visited);
                    dfs(i, j, grid, visited);
                }
            }
        }
        return island;
    }
}