/*
You are given an image represented by an m x n grid of integers image, where image[i][j] represents the pixel value of the image. You are also given three integers sr, sc, and color. Your task is to perform a flood fill on the image starting from the pixel image[sr][sc].
To perform a flood fill:
Begin with the starting pixel and change its color to color.
Perform the same process for each pixel that is directly adjacent (pixels that share a side with the original pixel, either horizontally or vertically) and shares the same color as the starting pixel.
Keep repeating this process by checking neighboring pixels of the updated pixels and modifying their color if it matches the original color of the starting pixel.
The process stops when there are no more adjacent pixels of the original color to update.
Return the modified image after performing the flood fill.

Input: image = [ [1, 1, 1], [1, 1, 0], [1, 0, 1] ], sr = 1, sc = 1, newColor = 2
Output: [ [2, 2, 2], [2, 2, 0], [2, 0, 1] ]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
*/

class Solution{
  int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
    int n= image.length;
    int m = image[0].length;
    int org = image[sr][sc];
    if(org == newColor) return image;
    for(int i = 0; i < n;i++){
      for(int j = 0; j < m; j++){
        if(image[i][j] == org){
          dfs(image,i,j,newColor);
        }
      }
    }
    return image;
  }
  private void dfs(int image,int r, int c, int n, int m, int org, int newColor){
    if(r < 0 || c < 0 || r >= n || c >= m || image[r][c] != org) return;
    image[r][c] = newColor;
    for(int[] d: dirs){
      dfs(image,r + d[0], c + d[1], n,m,org,newColor);
    }
  }
}
