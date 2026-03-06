/*
Given a binary grid[][], where each cell contains either 0 or 1, find the distance of the nearest 1 for every cell in the grid.
The distance between two cells (i1, j1)  and (i2, j2) is calculated as |i1 - i2| + |j1 - j2|. 
You need to return a matrix of the same size, where each cell (i, j) contains the minimum distance from grid[i][j] to the nearest cell having value 1.
Note: It is guaranteed that there is at least one cell with value 1 in the grid.
Examples
Input: grid[][] = [[0, 1, 1, 0], 
                [1, 1, 0, 0], 
                [0, 0, 1, 1]]
Output: [[1, 0, 0, 1], 
        [0, 0, 1, 1], 
        [1, 1, 0, 0]]
*/

class Solution{
  static int dirs[][] = {{0,1},{1,0},{-1,0},{0,-1}};
   public int[][] nearest(int[][] grid){
     int n = grid.length;
     int m = grid[0].length;
     int[][] dist = new int[n][m];
     for(int i = 0; i < n;i++){
       for(int j = 0; j < m;j++){
         if(grid[i][j] == 1){
           dist[i][j] = 0;
           
         }
   }
}
