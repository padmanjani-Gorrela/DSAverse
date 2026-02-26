/*
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

Example 1:
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
*/

class Solution{
  public int numSubarrayProductLessThanK(int[] nums, int k){
    int n = nums.length;
    int l = 0,r = 0;
    int seg = 0;
    int prod = 1;
    while(r < n){
      prod *= nums[r];
      while(prod > k){
        prod /= nums[l];
        l++;
      }
      seg += (r - l + 1);
      r++;
    }
    return seg;
  }
}
