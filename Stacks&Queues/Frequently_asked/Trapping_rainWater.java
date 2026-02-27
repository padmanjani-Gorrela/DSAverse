/*
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

Examples:
Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

*/
class Solution{
  public int TrappingWater(int[] arr){
    int n = arr.length;
    int l = 0, r = n - 1;
    int leftMax = 0, rightMax = 0, total = 0;
    while(l < r){
      if(arr[l] <= arr[r]){
        if(leftMax > arr[l]){
          total += leftMax - arr[l];
        }
        else leftMax = arr[l];
        l++;
      }
      else{
        if(rightMax > arr[r]){
          total += rightMax - arr[r];
        }
        else rightMax = arr[r];
        r--;
      }
    }
    return total;
  }
}
