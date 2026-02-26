/*

*/
class Solution{
  public int smallSum(int[] nums, int k){
    int l = 0, r = 0;
    int seg = 0;
    while(r < n){
      sum += nums[r];
     while(sum > k){
       sum -= nums[l];
       l++;
     }
     seg += (r- l + 1);
     r++;
    }
    return seg;
  }
}
