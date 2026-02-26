/*
Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.

Example 1:
Input: nums = [8,2,4,7], limit = 4
Output: 2 
Explanation: All subarrays are: 
[8] with maximum absolute diff |8-8| = 0 <= 4.
[8,2] with maximum absolute diff |8-2| = 6 > 4. 
[8,2,4] with maximum absolute diff |8-2| = 6 > 4.
[8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
[2] with maximum absolute diff |2-2| = 0 <= 4.
[2,4] with maximum absolute diff |2-4| = 2 <= 4.
[2,4,7] with maximum absolute diff |2-7| = 5 > 4.
[4] with maximum absolute diff |4-4| = 0 <= 4.
[4,7] with maximum absolute diff |4-7| = 3 <= 4.
[7] with maximum absolute diff |7-7| = 0 <= 4. 
Therefore, the size of the longest subarray is 2.

Leetcode 1438 - do practice

*/

class Solution{
  public int longestSubarray(int[] nums, int limit){
    int n = nums.length;
    Deque<Integer> min= new ArrayDeque<>();
    Deque<Integer> max = new ArrayDeque<>();
    int l = 0;
    int ans = 0;
    for(int r = 0;r < n;r++){
      while(!min.isEmpty() && nums[min.peekFirst()] > nums[r]){
          min.removeFirst();
      }
      while(!max.isEmpty() && nums[max.peekFirst()] < nums[r]){
        max.removeFirst();
      }
      min.addLast(r);
      max.addLast(r);
      while(nums[min.peekFirst()] - nums[max.peekFirst()] > limit){
        if(min.peekFirst() == l){
          min.removeFirst();
        }
       if(max.peekFirst() == l){
          max.removeFirst();
       }
      }
      ans = Math.max(ans, r - l + 1);
    }
    return ans;
  }
}
        
          
        
    
