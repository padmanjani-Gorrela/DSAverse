/*
Given an array of integers, nums,sort the array in non-decreasing order using the merge sort algorithm. Return the sorted array.
A sorted array in non-decreasing order is one in which each element is either greater than or equal to all the elements to its left in the array.

Example 1
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.
*/

class Solution{
  public int[] mergeSort(int[] nums){
    merges(nums, 0, nums.length - 1);
    return nums;
  }
  private void merge(int[] nums, int low, int mid, int high){
   int left = low;
    int right = mid + 1;
    ArrayList<Integer> temp = new ArrayList<>();
     int mid = (left + right)/2;
     while(left <= right){
       if(nums[left] <= nums[right]){
         temp.add(nums[left]);
         left++;
       }
       else{
         temp.add(nums[right]);
         right++;
       }
     }
    while(left <= mid){
      temp.add(nums[left]);
      left++;
    }
    while(mid <= right){
      temp.add(nums[right]);
      right++;
    }
     for(int i = low; i <= high; i++){
        nums[i] = temp.get(i - low);
    }
  }
  private void merges(int[] nums, int left, int right){
    if (low >= high) {
      return;
    }
    int mid = (low + high)/2;
    merges(nums, low,mid);
    merges(nums, mid + 1,high);
    merge(nums, mid, low, high);
  }
}
