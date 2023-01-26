//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    
    private int[] dr = {-1, 0, 1, 0};
	private int[] dc = {0, 1, 0, -1};

	private void dfs(int r, int c, int[][] image, boolean[][] visited, int newColor) {

		visited[r][c] = true;
		int initialColor = image[r][c];
		image[r][c] = newColor;

		int row = image.length;
		int col = image[0].length;

		for(int i=0; i<4; i++) {
			int newRow = r + dr[i];
			int newCol = c + dc[i];

			if(newRow<0 || newRow>=row || newCol<0 || newCol>=col) continue;

			if(visited[newRow][newCol] == false && image[newRow][newCol] == initialColor) {
				dfs(newRow, newCol, image, visited, newColor);
			}
		}
	}
    
    public int[][] floodFill(int[][] image, int r, int c, int newColor) {
        // Code here 
        if(image[r][c]==newColor) return image;
		
		int row = image.length;
		int col = image[0].length;

		boolean[][] visited = new boolean[row][col];

		dfs(r, c, image, visited, newColor);
		return image;
    }
}