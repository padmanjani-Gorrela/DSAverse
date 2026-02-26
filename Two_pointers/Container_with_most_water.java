/*
You are given an array height[] where each element represents a vertical line.
Find two lines that together with the x-axis form a container that holds the maximum water.
Return the maximum water.

height = [1,8,6,2,5,4,8,3,7]
Output = 49

Explanation:
Use lines at index 1 and 8:
width = 8-1 = 7
height = min(8,7) = 7
area = 7 * 7 = 49
*/

class Solution{
  public int maxArea(int height[]){
    int n = height.length;
    int l = 0.r = n - 1;
    while(l < r){
      int h = Math.max(height[l],height[r]);
      int w = r - l;
      int maxArea = Math.max(maxArea, h*w);
      if(height[l] < height[r]) l++;
      else r--;
    }
    return maxArea;
  }
}
      
    
