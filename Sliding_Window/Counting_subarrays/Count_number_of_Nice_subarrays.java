/*
Given an array nums and an integer k. An array is called nice if and only if it contains k odd numbers. Find the number of nice subarrays in the given array nums.
A subarray is continuous part of the array.

Example 1
Input : nums = [1, 1, 2, 1, 1] , k = 3
Output : 2
Explanation : The subarrays with three odd numbers are
[1, 1, 2, 1]
[1, 2, 1, 1]
*/

class Solution {
    public int numberOfOddSubarrays(int[] nums, int k) {
        return odd(nums, k) - odd(nums, k -1);
    }
    private int odd(int[] nums, int k){
        int l = 0,r = 0;
        int sum = 0, count = 0;
        while(r < nums.length){
            sum += nums[r] % 2;
            while(sum > k){
                sum -= nums[l] % 2;
                l++;
            }
            count += (r - l  + 1);
            r++;
        }
        return count;
    }
}
