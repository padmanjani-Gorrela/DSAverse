/*
Given an integer array nums, return the sum of the 1st and last element of the array.

Examples:
Input: nums = [2, 3, 4, 5, 6]
Output: 8

Explanation: 1st element = 2, last element = 6, sum = 2 + 6 = 8.
*/
class Solution {
    public int sumOfFirstAndLast(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int sum = first + last;
        return sum;
    }
}
