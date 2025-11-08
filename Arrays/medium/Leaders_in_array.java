/*
Given an integer array nums, return a list of all the leaders in the array.

A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

Examples:
Input: nums = [1, 2, 5, 3, 1, 2]
Output: [5, 3, 2]
Explanation:
2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]
*/

METHOD 1:
/*
Iterate through each element of the array with the variable let's say i and take a boolean variable leader set at true initially which will tell if nums[i] is a leader or not.
For each i, iterate through the elements to the right (from i+1 to the end of the array) with the variable j & check if nums[j] is greater than nums[i], if so, reinitialize the variable leader as false and break.
After exiting from the inner loop, check if leader equals true, if so add nums[i] to ans vector. Finally return the answer vector.
*/
class Solution{
  public List<Integer> leaders(int[] nums){
    List<Integer> ans = new ArrayList<>();
    for(int i = 0; i < nums.length;i++){
      boolean lead = false;
      for(int j = i + 1; j < nums.length;j++){
        if(nums[j] >= nums[i]){
          lead = false;
          break;
        }
      }
      if(lead){
        ans.add(nums[i]);
      }
    }
    return ans;
  }
}
/*
Time Complexity: O(N2).
Space Complexity : O(1).
*/

METHOD 2:
/*
Set a variable max to the last element of the array (nums[sizeOfArray - 1]), as the last element is always a leader.
Create an empty list ans to store the leader elements and add the last element of the array to this list initially, as it is always a leader.
Start from the second last element (index = sizeOfArray - 2) and move towards the first element (index = 0)
For each element, compare it with the max variable. If the current element is greater than max, add this element to the ans list and update max to the current element.
The ans list now contains all the leader elements in the order they appear in the array.
*/

class Solution{
  public int leaders(int[] nums){
    ArrayList<Integer> ans = new ArrayList<>();
    int n = nums.length;
    int max = nums[n - 1];
    ans.add(nums[n - 1]);

    for(int i = n -2; i>=0;i--){
      if(nums[i] > max){
        ans.add(nums[i]);
        max = nums[i];
      }
    }
    Collections.reverse(ans);
    return ans;
  }
}

/*
Time Complexity:O(N), for single traversal of array , where N is the length of that array.
Space Complexity: O(1), as extra space to store answer is not considered.
*/
    
