// Given a binary array nums and an integer k, flip at most k 0's.
// Return the maximum number of consecutive 1's after performing the flipping operation.

// Example 1

// Input : nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3
// Output : 10
// Explanation : The maximum number of consecutive 1's are obtained only if we flip the 0's present at position 3, 4, 5 (0 base indexing).

// // The array after flipping becomes [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0].

// The number of consecutive 1's is 10.

class Solution{
  public int findMaxConsecutiveOnes(int[] nums){
    int l = 0, zero = 0, ans = 0;
    while(r < n){
      if(nums[r] == 0) zero++;
      while(zero > k){
        if(nums[l] == 0){
          zero--;
          l++;
        }
        ans = Math.max(ans, r - l + 1);
      }
    return ans;
    }
  }
