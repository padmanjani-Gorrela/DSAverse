/*
Problem in one sentence
You are given a grid where:
0 = gate
-1 = wall
INF (2147483647) = empty room
Fill each empty room with the distance to its nearest gate.

BFS plan encourages correctness
Push all gates (0) into the queue first
Treat each gate as distance 0
BFS level by level
When visiting a neighbor:
Only update if it is INF
Set rooms[nr][nc] = rooms[r][c] + 1
Walls (-1) are never entered

No visited array needed — distance update itself marks visited.

input:
INF  -1   0   INF
INF INF INF  -1
INF  -1 INF  -1
0    -1 INF  INF

output:
3  -1  0  1
2   2  1 -1
1  -1  2 -1
0  -1  3  4
min distance = 4.
*/

class Solution{
  int[][] dirs = {{1,0},{-1,0},{0,1}.{0,-1}};
  public void WallsAndGates(int[][] grid){
    int n = grid.length;
    int m = grid[0].length;
    Queue<int[]> q = new LinkedList<>();
    for(int i = 0; i < n;i++){
      for(int j = 0; j < m;j++){
        if(grid[i][j] == 0){
          q.offer(new int[]{i,j});
        }
      }
    }
    while(!q.isEmpty()){
      int[] curr = q.poll();
      int r = curr[0];
      int c = curr[1];
      for(int[] d : dirs){
        int nr = r + d[0];
        int nc = c + d[1];
        if(nr >= 0 && nc >=0 && nr < n && nc < m && grid[nr][nc] == Integer.MAX_VALUE){
          grid[nr][nc] = grid[r][c] + 1;
          q.offer(new int[]{nr,nc});
      }
    }
  }
}
    
