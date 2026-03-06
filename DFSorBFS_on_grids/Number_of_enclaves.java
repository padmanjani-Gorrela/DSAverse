/*
Given an N x M binary matrix grid, where 0 represents a sea cell and 1 represents a land cell. A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid. Find the number of land cells in the grid for which we cannot walk off the boundary of the grid in any number of moves.

Input: grid = [[0, 0, 0, 0], [1, 0, 1, 0], [0, 1, 1, 0], [0, 0, 0, 0]]
Output: 3
*/
class Solution{
  public int numberOfEnclaves(int[][] grid){
    int n = grid.length;
    int m = grid[0].length;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m;j++){
        if(i == 0 || j == 0 || i == n - 1 || j == m - 1){
          if(grid[i][j] == 1){
            q.offer(new int[]{i,j});
            grid[i][j] = 0;
          }
        }
      }
    }
    while(!q.isEmptyt()){
      int cur[] = q.poll();
      for(int[] d : dirs){
        int nr = cur[0] + d[0];
        int nc = cur[1] + d[1];
        if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1){
          grid[nr][nc] = 0;
          q.offer(new int[]{nr,nc});
        }
      }
    }
    int cnt = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m;j++){
        if(grid[i][j] == 1){
          cnt++;
        }
      }
    }
    return cnt;
  }
}
