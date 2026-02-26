/*
Given a binary array nums and an integer goal. Return the number of non-empty subarrays with a sum goal.
A subarray is a continuous part of the array.

Example 1
Input : nums = [1, 1, 0, 1, 0, 0, 1] , goal = 3
Output : 4
Explanation : The subarray with sum 3 are
[1, 1, 0, 1]
[1, 1, 0, 1, 0]
[1, 1, 0, 1, 0, 0]
[1, 0, 1, 0, 0, 1].
*/

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt = 0;
        int l = 0, r = 0;
        while(r < n){
            sum+= nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            cnt += (r - l + 1);
            r++;
        }
        return cnt;
    }
}
