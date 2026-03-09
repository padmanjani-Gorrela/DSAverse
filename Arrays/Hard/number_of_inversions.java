/*
Given an integer array nums. Return the number of inversions in the array.
Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
It indicates how close an array is to being sorted.
A sorted array has an inversion count of 0.
An array sorted in descending order has maximum inversion.

Example 1
Input: nums = [2, 3, 7, 1, 3, 5]
Output: 5
Explanation:
The responsible indexes are:
nums[0], nums[3], values: 2 > 1 & indexes: 0 < 3
nums[1], nums[3], values: 3 > 1 & indexes: 1 < 3
nums[2], nums[3], values: 7 > 1 & indexes: 2 < 3
nums[2], nums[4], values: 7 > 3 & indexes: 2 < 4
nums[2], nums[5], values: 7 > 5 & indexes: 2 < 5
*/
class Solution {
    public long numberOfInversions(int[] nums) {
        return merges(nums, 0, nums.length - 1);
    }
    public long merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        long cnt = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= right){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }
        while(left <= mid){
            temp.add(nums[left]);
            left++;
        }
        while(right <= high){
            temp.add(nums[right]);
            right++;
        }
        for(int i = 0; i < temp.size();i++){
            nums[low + i] = temp.get(i);
        }
        return cnt;
    }
    private long merges(int[] nums, int low, int high){
        if(low > high) return 0;
        long cnt = 0;
        int mid = (low + high)/2;
        cnt += merges(nums, low, mid);
        cnt += merges(nums, mid + 1, high);
        cnt += merge(nums, lwo, mid, high);
        return cnt;
    }
}
