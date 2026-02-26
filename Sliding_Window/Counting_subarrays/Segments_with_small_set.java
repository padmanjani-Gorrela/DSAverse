/*
*/

class Solution{
  public int SmallSet(int[] nums, int k){
    int l = 0,r = 0;
    int seg = 0;
    HashMap<Integer,Integer> mp = new HashMap<>();
    while(r < n){
      mp.put(nums[r], mp.getOrDefault(nums[r],0)+1);
      while(sum > k){
        mp.put(nums[l],mp.get(nums[l]) - 1);
        if(mp.get(nums[l]) == 0){
          mp.remove(nums[l]);
        }
        l++;
      }
      while(sum <= k){
        seg += (r - l + 1);
      }
      r++;
      return seg;
    }
  }
      
