/*
Given an integer array nums of size n and an integer k,
return an array containing the minimum element of every contiguous subarray of size k.

You must do it in O(n) time.
1 ≤ n ≤ 10^5
1 ≤ k ≤ n
-10^4 ≤ nums[i] ≤ 10^4

Example:
Input:
nums = [1,3,-1,-3,5,3,6,7]
k = 3

Output:
[-1,-3,-3,-3,3,3]

explanation:
[1,3,-1]   → -1
[3,-1,-3]  → -3
[-1,-3,5]  → -3
[-3,5,3]   → -3
[5,3,6]    → 3
[3,6,7]    → 3
*/

class Solution{
  public int[] slidingMin(int[]nums, int k){
    int n = nums.length;
    int[] ans = new int[n -k + 1];
    int ind = 0;
    Deque<Integer> q = new ArrayDeque<>();
    for(int r = 0; r <  n;r++){
      if(!q.isEmpty() && q.peekFirst() <= r - k){
        q.removeFirst();
      }
      while(!q.isEmpty() && nums[q.peekLast()] > nums[r]){
        q.removeLast();
      }
      q.addLast(r);
      if(r >= k - 1){
        ans[ind] = nums[q.peekFirst()];
        ind++;
      }
      return ans;
    }
  }
        
