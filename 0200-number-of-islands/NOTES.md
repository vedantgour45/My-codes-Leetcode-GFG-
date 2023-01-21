```
class Solution {
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
bfs(i, j, grid, visited);
}
}
}
return island;
}
}
```