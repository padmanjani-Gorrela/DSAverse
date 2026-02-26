/*

*/

class Solution{
  public int BigSum(int[] nums,int k){
    int l = 0,r = 0;
    int segments = 0;
    while(r < n){
      sum+= nums[r];
      while(sum >= k){
        segments += (r - l + 1);
        sum -= nums[l];
        l++;
      }
      r++;
    }
    return segments;
  }
}
