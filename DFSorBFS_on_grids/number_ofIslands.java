/*
Given a grid of size N x M (N is the number of rows and M is the number of columns in the grid) consisting of '0's (Water) and ‘1's(Land). Find the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

Input: grid = [ ["1", "1", "1", "0", "1"], ["1", "0", "0", "0", "0"], ["1", "1", "1", "0", "1"], ["0", "0", "0", "1", "1"] ]
Output: 2
Explanation: This grid contains 2 islands. Each '1' represents a piece of land, and the islands are formed by connecting adjacent lands horizontally or vertically. Despite some islands having a common edge, they are considered separate islands because there is no land connectivity in any of the eight directions between them. Therefore, the grid contains 2 islands.
*/

class Solution{
  int[][] dirs = {{0,1},{0,-1},{1,1},{1,-1},{-1,1},{1,0},{-1,0}};
                                  
  public static int NumberOfIslands(char[][] grid){
    int n = grid.length;
    int cnt = 0;
    int m = grid[0].length;
    for(int i = 0; i < n;i++){
      for(int j = 0; j < m;j++){
        if(grid[i][j] == 1){
          cnt++;
          dfs(i,j,grid,n,m);
        }
      }
    }
    return cnt;
  }
  public static void dfs(int r, int c, char[][] grid, int n, int m){
    if(r < 0 || c < 0 || r >= n || c>= m || grid[r][c] == 0) return;
    grid[r][c] = 1;
    for(int[] d : dirs){
      dfs(r + d[0], c + d[1], grid, n,m);
    }
  }
}
