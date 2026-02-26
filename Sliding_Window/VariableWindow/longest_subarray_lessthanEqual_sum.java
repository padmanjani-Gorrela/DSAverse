/*

*/

class Solution {
    public int longestSubarrayWithLTES(List<Integer> a, long s) {
      int l = 0, r = 0;
      long sum = 0;
      long maxlen = 0;
      while(r < n){
        sum += a.get(r);
        if(sum > s){
          sum -= a.get(l);
          l++;
        }
        if(sum <= s){
          maxlen = Math.max(maxlen, r - l + 1);
        }
        r++;
      }
      return maxlen;
    }
}
