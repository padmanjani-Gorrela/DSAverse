/*
Given a matrix mat[][], where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cell have fresh oranges
2 : Cell have rotten oranges
Your task is to determine the minimum time required so that all the oranges become rotten. A rotten orange at index (i, j) can rot other fresh orange at indexes (i-1, j), (i+1, j), (i, j-1), (i, j+1) (up, down, left and right) in a unit time.
Note: If it is impossible to rot every orange then simply return -1.

Input: mat[][] = [[2, 1, 0, 2, 1], [1, 0, 1, 2, 1], [1, 0, 0, 2, 1]]
Output: 2
Explanation: Oranges at positions (0,0), (0,3), (1,3), and (2,3) will rot adjacent fresh oranges in successive time frames.
All fresh oranges become rotten after 2 units of time.
*/
class Solution{
  int[][] dirs = {{1,0},{0,1},{0,-1},{-1,0}};
  public int orangesRot(int[][] grid){
    int n = grid.length;
    int m = grid[0].length;
    int fresh = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m;j++){
        if(grid[i][j] == 2) q.offer(new int[]{i,j});
        if(grid[i][j] == 1) fresh++;
      }
    }
    int mins = 0;
    while(!q.isEmpty()){
      int size = q.size();
      boolean spread = false;
      for(int i = 0; i < size; i++){
        int cur[] = q.poll();
        for(int[] d : dirs){
          int nr = cur[0] + d[0];
          int nc = cur[1] + d[1];
          if(nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1){
            grid[nr][nc] = 2;
            fresh--;
            spread = true;
          }
        }
      }
      if(spread) mins++;
    }
    return (fresh == 0) mins: -1;
  }
}


// Time Complexity: O(N*M) (where N and M are the dimensions of grid)
// Space Complexity: O(N*M) - Using a queue data structure, which will store all cells if a grid is full of rotten oranges taking O(N*M) space.
