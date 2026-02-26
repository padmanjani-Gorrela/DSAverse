/*

*/
class Solution{
  public int shortestSubarray(int[] nums, int k){
    int n = nums.length;
    int l = 0, r = 0;
    int sum = 0;
    while(r < n){
      sum += nums[r];
      while(sum > k){
        minlen = Math.min(minlen, r - l + 1);
        sum -= nums[l];
        l++;
      }
      r++;
    }
    return (minlen == Integer.MAX_VALUE) ? -1 : minlen;
  }
}
