/*
Given an integer array nums of size n and an integer k,
for every contiguous subarray of size k, find:
(maximum element + minimum element)
Return the sum of these values for all windows.
time complextiy : O(n) recommended
1 ≤ n ≤ 10^5
1 ≤ k ≤ n
-10^4 ≤ nums[i] ≤ 10^4

Example:
Input:
nums = [2, 5, -1, 7, -3, -1, -2]
k = 4

Output:
18

Explanation:
[2,5,-1,7]    → max=7   min=-1   sum=6
[5,-1,7,-3]   → max=7   min=-3   sum=4
[-1,7,-3,-1]  → max=7   min=-3   sum=4
[7,-3,-1,-2]  → max=7   min=-3   sum=4

Total = 6 + 4 + 4 + 4 = 18
*/

class Solution{
  public int sumOfMaxMin(int[] nums, int k){
    int n = nums.length;
    int sum = 0;
    if(n < k) return 0;
    Deque<Integer> q1 = new ArrayDeque<>();
    Deque<Integer> q2 = new ArrayDeque<>();
    for(int r = 0;r < n;r++){
      if(!q1.isEmpty() && q1.peekFirst() <= r - k){
        q1.removeFirst();
      }
      if(!q2.isEmpty() && q2.peekFirst() <= r - k){
        q2.removeFirst();
      }
      while(!q1.isEmpty() && nums[q1.peekLast()] < nums[r]){
        q1.removeLast();
      }
      while(!q2.isEmpty() && nums[q2.peekLast()] > nums[r]){
        q2.removeLast();
      }
      q1.addLast(r);
      q2.addLast(r);
      if(r >= k - 1){
        sum += nums[q1.peekFirst()] + nums[q2.peekFirst()];
      }
    }
    return sum;
  }
}
